package study.securitytest.global.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                    .antMatchers("/admin").hasRole("ADMIN")
                    .antMatchers("/staff").hasRole("STAFF")
                    .antMatchers("/teacher").hasRole("TEACHER")
                    .antMatchers("/user").hasRole("USER")
                    .antMatchers("/anonymous").permitAll()
                    .antMatchers("/", "/signup", "/login**", "/logout").permitAll()
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/login")
                    .usernameParameter("name")
                    .passwordParameter("password")
                    .loginProcessingUrl("/login-proc")
//                    .defaultSuccessUrl("/login-success")
                    .failureUrl("/login?error")
                    .successHandler(new AuthenticationSuccessHandlerImpl())
                    .and()
                .logout()
                    .logoutUrl("/logout")
//                    .logoutSuccessUrl("/login?logout")
                    .logoutSuccessUrl("/")
                    .invalidateHttpSession(true)
                    .clearAuthentication(true)
                    .deleteCookies("JSESSIONID")
                    .and()
                .exceptionHandling()
                    .accessDeniedPage("/accessDenied")
        ;
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/public/**")
        ;
    }

//    private void configure_http(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/admin").hasRole("ADMIN")
//                .antMatchers("/staff").hasAnyRole("ADMIN", "STAFF")
//                .antMatchers("/teacher").hasAnyRole("ADMIN", "STAFF", "TEACHER")
//                .antMatchers("/user").hasAnyRole("ADMIN", "STAFF", "TEACHER", "USER")
//                .antMatchers("/", "/login", "/logout", "/signup").permitAll()
//                .and().formLogin();
//    }
}

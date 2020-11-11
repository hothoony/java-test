package study.securitytest.global.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/admin").setViewName("view/admin");
        registry.addViewController("/staff").setViewName("view/staff");
        registry.addViewController("/teacher").setViewName("view/teacher");
        registry.addViewController("/user").setViewName("view/user");
        registry.addViewController("/anonymous").setViewName("view/anonymous");

        registry.addViewController("/").setViewName("index");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/public/**/*")
                .addResourceLocations("classpath:/static/")
        ;
    }
}

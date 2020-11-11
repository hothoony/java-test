package study.securitytest.global.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import study.securitytest.domain.Member;
import study.securitytest.domain.MemberRepository;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("------------------------");
        System.out.println("## UserDetailsServiceImpl.loadUserByUsername");
        System.out.println("username = " + username);
        Member member = memberRepository.findByName(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));

        UserDetailsImpl userDetails = new UserDetailsImpl(member);
        System.out.println("userDetails = " + userDetails);
        return userDetails;

//        List<GrantedAuthority> authorities = new ArrayList<>();
//        if ("ADMIN".equals(username)) {
//            authorities.add(new SimpleGrantedAuthority(RoleType.ADMIN.getValue()));
//        } else {
//            authorities.add(new SimpleGrantedAuthority(RoleType.USER.getValue()));
//        }
//        return new User(member.getName(), member.getPassword(), authorities);
    }
}

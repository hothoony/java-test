package study.securitytest.global;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import study.securitytest.domain.MemberDto;
import study.securitytest.domain.MemberService;

@Component
@RequiredArgsConstructor
public class AppInit {

    private final MemberService memberService;

    @Bean
    private CommandLineRunner commandLineRunner() {
        return args -> {
            memberService.joinMember(new MemberDto("admin", "11", "ADMIN,STAFF,TEACHER,USER"));
            memberService.joinMember(new MemberDto("staff", "11", "STAFF,TEACHER,USER"));
            memberService.joinMember(new MemberDto("teacher", "11", "TEACHER,USER"));
            memberService.joinMember(new MemberDto("user", "11", "USER"));
        };
    }
}

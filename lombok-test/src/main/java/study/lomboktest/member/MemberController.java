package study.lomboktest.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MemberController {

    @GetMapping("/members")
    public List<MemberDto> getMembers() {
        List<MemberDto> memberDtos = Arrays.asList(
                new MemberDto(1L, "memberA", 10),
                new MemberDto(2L, "memberB", 20),
                new MemberDto(3L, "memberC", 30));
        return memberDtos;
    };
}

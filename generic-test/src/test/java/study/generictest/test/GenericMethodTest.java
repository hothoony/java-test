package study.generictest.test;

import org.junit.jupiter.api.Test;
import study.generictest.test.code.dto.MemberDto;
import study.generictest.test.code.dto.TeamDto;
import study.generictest.test.code.generic.GenericMethod;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericMethodTest {

    @Test
    void getValue_teamDto() {
        GenericMethod genericMethod = new GenericMethod();

        TeamDto teamDto = genericMethod.getValue("abc", TeamDto.class); // HERE

        System.out.println("teamDto = " + teamDto);
        assertThat(teamDto.getClass()).isEqualTo(TeamDto.class);
    }

    @Test
    void getValue_memberDto() {
        GenericMethod genericMethod = new GenericMethod();

        MemberDto memberDto = genericMethod.getValue("abc", MemberDto.class); // HERE

        System.out.println("memberDto = " + memberDto);
        assertThat(memberDto.getClass()).isEqualTo(MemberDto.class);
    }
}

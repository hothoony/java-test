package study.generictest.generic_method;

import org.junit.jupiter.api.Test;
import study.generictest.dto.MemberDto;
import study.generictest.dto.TeamDto;
import study.generictest.code.GenericMethod;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericMethodTest {

    @Test
    void teamDto() {
        GenericMethod genericMethod = new GenericMethod();

        TeamDto teamDto = genericMethod.getValue("abc", TeamDto.class); // HERE

        System.out.println("teamDto = " + teamDto);
        assertThat(teamDto.getClass()).isEqualTo(TeamDto.class);
    }

    @Test
    void memberDto() {
        GenericMethod genericMethod = new GenericMethod();

        MemberDto memberDto = genericMethod.getValue("abc", MemberDto.class); // HERE

        System.out.println("memberDto = " + memberDto);
        assertThat(memberDto.getClass()).isEqualTo(MemberDto.class);
    }
}

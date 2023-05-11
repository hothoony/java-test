package study.generictest.test;

import org.junit.jupiter.api.Test;
import study.generictest.test.code.dto.MemberDto;
import study.generictest.test.code.dto.TeamDto;
import study.generictest.test.code.generic.GenericMethod;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericMethodTest {

    @Test
    void getDto_teamDto() {
        GenericMethod genericMethod = new GenericMethod();

        TeamDto teamDto = genericMethod.getDto("abc", TeamDto.class); // HERE

        System.out.println("teamDto = " + teamDto);
        assertThat(teamDto.getClass()).isEqualTo(TeamDto.class);
    }

    @Test
    void getDto_memberDto() {
        GenericMethod genericMethod = new GenericMethod();

        MemberDto memberDto = genericMethod.getDto("abc", MemberDto.class); // HERE

        System.out.println("memberDto = " + memberDto);
        assertThat(memberDto.getClass()).isEqualTo(MemberDto.class);
    }

    @Test
    void getDtoList_teamDto() {
        GenericMethod genericMethod = new GenericMethod();
        List<TeamDto> list = genericMethod.getDtoList("abc", TeamDto.class);
        System.out.println("list = " + list);
    }

    @Test
    void getDtoList_memberDto() {
        GenericMethod genericMethod = new GenericMethod();
        List<MemberDto> list = genericMethod.getDtoList("abc", MemberDto.class);
        System.out.println("list = " + list);
    }
}

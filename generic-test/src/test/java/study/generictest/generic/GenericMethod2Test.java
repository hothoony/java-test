package study.generictest.generic;

import org.junit.jupiter.api.Test;
import study.generictest.dto.MemberDto;
import study.generictest.dto.TeamDto;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericMethod2Test {

    @Test
    void getDto_teamDto() {
        GenericMethod2 genericMethod2 = new GenericMethod2();

        TeamDto teamDto = genericMethod2.getDto("abc", TeamDto.class); // HERE

        System.out.println("teamDto = " + teamDto);
        assertThat(teamDto.getClass()).isEqualTo(TeamDto.class);
    }

    @Test
    void getDto_memberDto() {
        GenericMethod2 genericMethod2 = new GenericMethod2();

        MemberDto memberDto = genericMethod2.getDto("abc", MemberDto.class); // HERE

        System.out.println("memberDto = " + memberDto);
        assertThat(memberDto.getClass()).isEqualTo(MemberDto.class);
    }

    @Test
    void getDtoList_teamDto() {
        GenericMethod2 genericMethod2 = new GenericMethod2();
        List<TeamDto> list = genericMethod2.getDtoList("abc", TeamDto.class);
        System.out.println("list = " + list);
    }

    @Test
    void getDtoList_memberDto() {
        GenericMethod2 genericMethod2 = new GenericMethod2();
        List<MemberDto> list = genericMethod2.getDtoList("abc", MemberDto.class);
        System.out.println("list = " + list);
    }
}

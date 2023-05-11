package study.generictest.test;

import org.junit.jupiter.api.Test;
import study.generictest.test.code.generic.GenericClazz;
import study.generictest.test.code.dto.MemberDto;
import study.generictest.test.code.dto.TeamDto;

import static org.assertj.core.api.Assertions.assertThat;

class GenericClazzTest {

    @Test
    void teamDto() {
        GenericClazz<TeamDto> genericClazz = new GenericClazz<>(); // HERE
        genericClazz.setDto(new TeamDto());

        TeamDto dto = genericClazz.getDto();

        assertThat(dto.getClass() == TeamDto.class);
        System.out.println("dto.getClass() = " + dto.getClass());
        System.out.println("dto = " + dto);
    }

    @Test
    void memberDto() {
        GenericClazz<MemberDto> genericClazz = new GenericClazz<>(); // HERE
        genericClazz.setDto(new MemberDto());

        MemberDto dto = genericClazz.getDto();

        assertThat(dto.getClass() == MemberDto.class);
        System.out.println("dto.getClass() = " + dto.getClass());
        System.out.println("dto = " + dto);
    }
}

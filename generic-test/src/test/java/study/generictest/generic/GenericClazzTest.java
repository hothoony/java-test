package study.generictest.generic;

import org.junit.jupiter.api.Test;
import study.generictest.generic.GenericClazz;
import study.generictest.dto.MemberDto;
import study.generictest.dto.TeamDto;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GenericClazzTest {

    @Test
    void getDto_teamDto() {
        GenericClazz<TeamDto> genericClazz = new GenericClazz<>(); // HERE
        genericClazz.setDto(new TeamDto());

        TeamDto dto = genericClazz.getDto();

        assertThat(dto.getClass() == TeamDto.class);
        System.out.println("dto.getClass() = " + dto.getClass());
        System.out.println("dto = " + dto);
    }

    @Test
    void getDto_memberDto() {
        GenericClazz<MemberDto> genericClazz = new GenericClazz<>(); // HERE
        genericClazz.setDto(new MemberDto());

        MemberDto dto = genericClazz.getDto();

        assertThat(dto.getClass() == MemberDto.class);
        System.out.println("dto.getClass() = " + dto.getClass());
        System.out.println("dto = " + dto);
    }

    @Test
    void getDtoList_teamDto() {
        GenericClazz<TeamDto> genericClazz = new GenericClazz<>();
        genericClazz.setDtoList(new TeamDto());

        List<TeamDto> list = genericClazz.getDtoList();
        System.out.println("list = " + list);
    }

    @Test
    void getDtoList_memberDto() {
        GenericClazz<MemberDto> genericClazz = new GenericClazz<>();
        genericClazz.setDtoList(new MemberDto());

        List<MemberDto> list = genericClazz.getDtoList();
        System.out.println("list = " + list);
    }
}

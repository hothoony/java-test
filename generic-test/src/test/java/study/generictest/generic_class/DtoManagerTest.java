package study.generictest.generic_class;

import org.junit.jupiter.api.Test;
import study.generictest.dto.MemberDto;
import study.generictest.dto.TeamDto;
import study.generictest.code.DtoManager;

import static org.assertj.core.api.Assertions.assertThat;

class DtoManagerTest {

    @Test
    void teamDto() {
        DtoManager<TeamDto> dtoManager = new DtoManager<>(); // HERE
        dtoManager.setDto(new TeamDto());

        TeamDto dto = dtoManager.getDto();

        assertThat(dto.getClass() == TeamDto.class);
        System.out.println("dto.getClass() = " + dto.getClass());
        System.out.println("dto = " + dto);
    }

    @Test
    void memberDto() {
        DtoManager<MemberDto> dtoManager = new DtoManager<>(); // HERE
        dtoManager.setDto(new MemberDto());

        MemberDto dto = dtoManager.getDto();

        assertThat(dto.getClass() == MemberDto.class);
        System.out.println("dto.getClass() = " + dto.getClass());
        System.out.println("dto = " + dto);
    }
}

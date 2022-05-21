package study.generictest.generic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DtoManagerTest {

    @Test
    void memberDto_test() {
        DtoManager<MemberDto> dtoManager = new DtoManager<>();
        dtoManager.setDto(new MemberDto());
        MemberDto dto = dtoManager.getDto();
        assertThat(dto.getClass() == MemberDto.class);
        System.out.println("dto.getClass() = " + dto.getClass());
        System.out.println("dto = " + dto);
    }

    @Test
    void teamDto_test() {
        DtoManager<TeamDto> dtoManager = new DtoManager<>();
        dtoManager.setDto(new TeamDto());
        TeamDto dto = dtoManager.getDto();
        assertThat(dto.getClass() == TeamDto.class);
        System.out.println("dto.getClass() = " + dto.getClass());
        System.out.println("dto = " + dto);
    }
}

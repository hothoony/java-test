package study.generictest.generic;

import org.junit.jupiter.api.Test;

class DtoManagerTest {

    @Test
    void memberDto_test() {
        DtoManager<MemberDto> dtoManager = new DtoManager<>();
        dtoManager.setDto(new MemberDto());
        MemberDto dto = dtoManager.getDto();
        System.out.println("dto = " + dto);
    }

    @Test
    void teamDto_test() {
        DtoManager<TeamDto> dtoManager = new DtoManager<>();
        dtoManager.setDto(new TeamDto());
        TeamDto dto = dtoManager.getDto();
        System.out.println("dto = " + dto);
    }
}
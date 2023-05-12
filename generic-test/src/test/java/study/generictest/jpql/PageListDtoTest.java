package study.generictest.jpql;

import org.junit.jupiter.api.Test;
import study.generictest.dto.MemberDto;

import java.util.ArrayList;
import java.util.List;

import static study.generictest.jpql.QueryResultMapper.listTupleToDtos;

class PageListDtoTest {

    @Test
    void name() {
        List<Tuple> list = new ArrayList<>();
        List<MemberDto> pageList = listTupleToDtos(list, MemberDto.class);
        PageListDto<MemberDto> pageListDto = new PageListDto<>(pageList);
        List<MemberDto> pageList2 = pageListDto.getPageList();
    }
}
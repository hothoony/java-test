package com.example.listtest.test1;

import com.example.listtest.dto.MemberDto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class List_sort_test {

    @Test
    void filter_test() {
        
        List<MemberDto> memberDtos = getMemberDtos();

        // 오름차순 정렬
        memberDtos.sort(Comparator.comparing((MemberDto m) -> m.getRegDt()));
        print(memberDtos);
        memberDtos.sort(Comparator.comparing(MemberDto::getRegDt));
        print(memberDtos);
        
        // 내림차순 정렬
        memberDtos.sort(Comparator.comparing((MemberDto m) -> m.getRegDt()).reversed());
        print(memberDtos);
        memberDtos.sort(Comparator.comparing(MemberDto::getRegDt).reversed());
        print(memberDtos);
    }

    private void print(List<MemberDto> memberDtos) {
        System.out.println();
        for (MemberDto memberDto : memberDtos) {
            System.out.println("memberDto = " + toString(memberDto));
        }
    }

    private static List<MemberDto> getMemberDtos() {
        List<MemberDto> memberDtos = new ArrayList<>(List.of(
                MemberDto.builder().memberNm("memberA").regDt("20250901").build(),
                MemberDto.builder().memberNm("memberB").regDt("20250930").build(),
                MemberDto.builder().memberNm("memberC").regDt("20251001").build(),
                MemberDto.builder().memberNm("memberD").regDt("20251031").build(),
                MemberDto.builder().memberNm("memberE").regDt("20251101").build(),
                MemberDto.builder().memberNm("memberF").regDt("20251130").build()
        ));
        return memberDtos;
    }

    private String toString(MemberDto memberDto) {
        return "MemberDto(memberNm=" + memberDto.getMemberNm() + ", regDt=" + memberDto.getRegDt() + ")";
    }
}

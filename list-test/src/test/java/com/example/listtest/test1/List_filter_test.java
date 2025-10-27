package com.example.listtest.test1;

import com.example.listtest.dto.MemberDto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class List_filter_test {

    @Test
    void filter_test() {
        
        List<MemberDto> memberDtos = getMemberDtos();

//        memberDtos = filterList(memberDtos, "20250916", "20250930");
//        memberDtos = filterList(memberDtos, "20251030", "20251031");
        memberDtos = filterList(memberDtos, "20250915", "20251015");

        for (MemberDto memberDto : memberDtos) {
            System.out.println("memberDto = " + toString(memberDto));
        }
    }

    private static List<MemberDto> filterList(List<MemberDto> memberDtos, String stdate, String endate) {
        
        LocalDate stDate = LocalDate.parse(stdate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        LocalDate enDate = LocalDate.parse(endate, DateTimeFormatter.ofPattern("yyyyMMdd"));

        memberDtos = memberDtos.stream()
                .filter(m -> {
                    LocalDate regDate = LocalDate.parse(m.getRegDt(), DateTimeFormatter.ofPattern("yyyyMMdd"));
                    if (!regDate.isBefore(stDate) && !regDate.isAfter(enDate)) {
                        return true;
                    }
                    return false;
                }).toList();
        
        return memberDtos;
    }

    private static List<MemberDto> getMemberDtos() {
        List<MemberDto> memberDtos = List.of(
                MemberDto.builder().memberNm("memberA").regDt("20250901").build(),
                MemberDto.builder().memberNm("memberB").regDt("20250930").build(),
                MemberDto.builder().memberNm("memberC").regDt("20251001").build(),
                MemberDto.builder().memberNm("memberD").regDt("20251031").build(),
                MemberDto.builder().memberNm("memberE").regDt("20251101").build(),
                MemberDto.builder().memberNm("memberF").regDt("20251130").build()
        );
        return memberDtos;
    }

    private String toString(MemberDto memberDto) {
        return "MemberDto(memberNm=" + memberDto.getMemberNm() + ", regDt=" + memberDto.getRegDt() + ")";
    }
}

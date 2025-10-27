package com.example.listtest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {

    private Long memberId;
    private String memberNm;
    private String memberEmail;
    private String memberNickname;
    private String mobilePhone;
    private String regDt;

    public MemberDto(String memberNm) {
        this.memberNm = memberNm;
    }
}

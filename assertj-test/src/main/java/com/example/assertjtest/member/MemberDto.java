package com.example.assertjtest.member;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MemberDto {
    
    private Integer memberSeq;
    private String memberNm;
    private String memberEmail;
    private Integer age;
}

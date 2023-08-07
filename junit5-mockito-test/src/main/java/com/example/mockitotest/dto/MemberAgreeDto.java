package com.example.mockitotest.dto;

import lombok.Data;

@Data
public class MemberAgreeDto {
    
    private Long memberId;
    
    private String emailAgreeYn;
    
    private String smsAgreeYn;
}

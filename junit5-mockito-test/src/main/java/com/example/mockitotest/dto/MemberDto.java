package com.example.mockitotest.dto;

import com.example.mockitotest.code.MemberStateCd;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MemberDto {

    private Long memberId;

    private UUID memberUuid;

    private String memberFnm;

    private String memberLnm;

    private Integer memberAge;

    private MemberStateCd memberStateCd;

    private LocalDateTime lastLoginTime;
}
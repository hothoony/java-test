package com.example.mockitotest.service;

import com.example.mockitotest.domain.Member;
import com.example.mockitotest.dto.MemberAgreeDto;
import com.example.mockitotest.dto.ReqMemberAddDto;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.verify;

@SpringBootTest
//@Transactional
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @MockBean
    MemberAgreeService memberAgreeService;

    @Test
    void notNull() {
        assertThat(memberService).isNotNull();
    }

    @Test
    void saveMember() {

        given(memberAgreeService.saveMemberAgree(any(MemberAgreeDto.class)))
                .willThrow(new RuntimeException("테스트 예외"));

        ReqMemberAddDto reqMemberAddDto = new ReqMemberAddDto("memberA");
        reqMemberAddDto.setMemberId(1L);
        Member member = new Member(1L, "memberA");

        Member actual = memberService.saveMember(reqMemberAddDto);

        assertThat(actual).isEqualTo(member);
    }
}

package com.example.mockitotest.service;

import com.example.mockitotest.domain.Member;
import com.example.mockitotest.dto.MemberAgreeDto;
import com.example.mockitotest.dto.ReqMemberAddDto;
import com.example.mockitotest.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.ui.ModelMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class MemberServiceTest_saveMember_mock {

    @InjectMocks
    MemberService memberService;

    @Mock
    MemberAgreeService memberAgreeService;

    @Mock
    MemberRepository memberRepository;

    @Mock
    ModelMapper modelMapper;

    @Test
    void notNull() {
        assertThat(memberService).isNotNull();
    }

    @Test
    void saveMember() {

        given(modelMapper.map(any(), Member.class)).willReturn(new Member(eq("memberA")));
        given(modelMapper.map(any(), ReqMemberAddDto.class)).willReturn(new ReqMemberAddDto(eq("memberA")));
        given(memberAgreeService.saveMemberAgree(any(MemberAgreeDto.class)))
                .willThrow(new RuntimeException("테스트 예외"));

        ReqMemberAddDto reqMemberAddDto = new ReqMemberAddDto("memberA");
        reqMemberAddDto.setMemberId(1L);
        Member member = new Member(1L, "memberA");

        Member actual = memberService.saveMember(reqMemberAddDto);

        assertThat(actual).isEqualTo(member);
    }
}

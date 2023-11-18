package com.example.mockitotest.service;

import com.example.mockitotest.domain.Member;
import com.example.mockitotest.domain.MemberAgree;
import com.example.mockitotest.dto.MemberAgreeDto;
import com.example.mockitotest.dto.ReqMemberAddDto;
import com.example.mockitotest.repository.MemberRepository;
import org.assertj.core.api.AbstractThrowableAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willCallRealMethod;
import static org.mockito.BDDMockito.willDoNothing;

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

    @Mock
    MailService mailService;

    @Mock
    SmsService smsService;

    @Test
    void saveMember() {

        // given
        given(modelMapper.map(any(), eq(Member.class))).willReturn(new Member("memberA"));
        given(modelMapper.map(any(), eq(MemberAgreeDto.class))).willReturn(new MemberAgreeDto());
        given(memberRepository.save(any())).willReturn(new Member("memberA"));
        given(memberAgreeService.saveMemberAgree(any(MemberAgreeDto.class))).willReturn(new MemberAgree());
        willDoNothing().given(mailService).sendMail(anyString());
        willDoNothing().given(smsService).sendSms(anyString());

        ReqMemberAddDto reqMemberAddDto = new ReqMemberAddDto("memberA");
        reqMemberAddDto.setMemberId(1L);
        Member member = new Member(1L, "memberA");

        // when
        Member actual = memberService.saveMember(reqMemberAddDto);

        // then
        then(memberRepository).should().save(any(Member.class));
        then(memberAgreeService).should().saveMemberAgree(any(MemberAgreeDto.class));
        then(mailService).should().sendMail(anyString());
        then(smsService).should().sendSms(anyString());
    }

    @Test
    void saveMember_exception() {

        assertThatThrownBy(() -> {

            given(modelMapper.map(any(), eq(Member.class))).willReturn(new Member("memberA"));
            given(modelMapper.map(any(), eq(MemberAgreeDto.class))).willReturn(new MemberAgreeDto());
            given(memberRepository.save(any())).willReturn(new Member("memberA"));
            given(memberAgreeService.saveMemberAgree(any(MemberAgreeDto.class)))
                    .willThrow(new RuntimeException("테스트 예외"));

            ReqMemberAddDto reqMemberAddDto1 = new ReqMemberAddDto("memberA");
            reqMemberAddDto1.setMemberId(1L);
            Member member1 = new Member(1L, "memberA");

            Member actual1 = memberService.saveMember(reqMemberAddDto1);

        })
        .isInstanceOf(RuntimeException.class)
        .hasMessage("테스트 예외");
    }

    @Test
    void notNull() {
        assertThat(memberService).isNotNull();
    }
}

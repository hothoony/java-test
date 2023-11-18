package com.example.mockitotest.service;

import com.example.mockitotest.domain.Member;
import com.example.mockitotest.dto.MemberAgreeDto;
import com.example.mockitotest.dto.ReqMemberAddDto;
import com.example.mockitotest.repository.MemberRepository;
import org.assertj.core.api.AbstractThrowableAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.ui.ModelMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
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
    void saveMember_exception() {

        AbstractThrowableAssert<?, ? extends Throwable> abstractThrowableAssert = assertThatThrownBy(() -> {

            given(modelMapper.map(any(), eq(Member.class))).willReturn(new Member("memberA"));
            given(modelMapper.map(any(), eq(MemberAgreeDto.class))).willReturn(new MemberAgreeDto());
            given(memberRepository.save(any())).willReturn(new Member("memberA"));
            given(memberAgreeService.saveMemberAgree(any(MemberAgreeDto.class)))
                    .willThrow(new RuntimeException("테스트 예외"));

            ReqMemberAddDto reqMemberAddDto = new ReqMemberAddDto("memberA");
            reqMemberAddDto.setMemberId(1L);
            Member member = new Member(1L, "memberA");

            Member actual = memberService.saveMember(reqMemberAddDto);

        });

        abstractThrowableAssert.isInstanceOf(RuntimeException.class);
        abstractThrowableAssert.hasMessage("테스트 예외");

    }

    @Test
    void notNull() {
        assertThat(memberService).isNotNull();
    }
}

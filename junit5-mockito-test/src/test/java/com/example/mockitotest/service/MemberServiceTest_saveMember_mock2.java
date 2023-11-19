package com.example.mockitotest.service;

import com.example.mockitotest.dto.ReqMemberAddDto;
import com.example.mockitotest.repository.MemberAgreeRepository;
import com.example.mockitotest.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.mockito.BDDMockito.*;

@SpringBootTest(classes = {
        MemberService.class,
        MemberAgreeService.class,
        ModelMapper.class
})
public class MemberServiceTest_saveMember_mock2 {

    @Autowired
    MemberService memberService;

    @MockBean
    MemberRepository memberRepository;

    @MockBean
    MemberAgreeRepository memberAgreeRepository;

    @SpyBean
    MailService mailService;

    @MockBean
    SmsService smsService;

    @Test
    void saveMember() {

        willDoNothing().given(mailService).sendMessage(anyString());

//        willAnswer(invocation -> {
//            System.out.println("메일 보내기 더미");
//            return null;
//        }).given(mailService).sendMessage(anyString());

        ReqMemberAddDto reqMemberAddDto = new ReqMemberAddDto("memberA");

        memberService.saveMember(reqMemberAddDto);

        then(mailService).should().sendMail(anyString());
        then(smsService).should().sendSms(anyString());
    }
}

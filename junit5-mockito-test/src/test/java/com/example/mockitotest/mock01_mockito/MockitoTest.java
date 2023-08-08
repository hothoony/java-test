package com.example.mockitotest.mock01_mockito;

import com.example.mockitotest.domain.Member;
import com.example.mockitotest.dto.ReqMemberAddDto;
import com.example.mockitotest.repository.MemberRepository;
import com.example.mockitotest.service.MemberService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockitoTest {

    @Mock
    MemberRepository memberRepository;

    @InjectMocks
    MemberService memberService;

    /**
     * when
     * run
     * verify
     */
    @Test
    void saveMember() {
        
        ReqMemberAddDto reqMemberAddDto = new ReqMemberAddDto("memberA");
        Member member = new Member("memberA");

        // when
        when(memberRepository.save(any(Member.class)))
                .thenReturn(member)
                .thenThrow(new RuntimeException("롤백 테스트"));

        // run
        Member saveMember1 = memberService.saveMember(reqMemberAddDto);

        // verify
        verify(memberRepository).save(any(Member.class));
        assertThat(saveMember1).isEqualTo(member);

        assertThatThrownBy(() -> {
            Member saveMember2 = memberService.saveMember(reqMemberAddDto);
        })
                .isInstanceOf(RuntimeException.class)
                .message().isEqualTo("롤백 테스트");
    }
}

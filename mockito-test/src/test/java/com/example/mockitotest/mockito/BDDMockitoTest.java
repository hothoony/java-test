package com.example.mockitotest.mockito;

import com.example.mockitotest.member.Member;
import com.example.mockitotest.member.MemberRepository;
import com.example.mockitotest.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
public class BDDMockitoTest {

    @Mock
    MemberRepository memberRepository;

    @InjectMocks
    MemberService memberService;

    /**
     * given
     * run
     * then
     */
    @Test
    void saveMember() {
        Member member = new Member("memberA");

        given(memberRepository.save(any(Member.class)))
                .willReturn(member)
                .willThrow(new RuntimeException("롤백 테스트"));

        Member saveMember1 = memberService.saveMember(member);
        then(memberRepository).should().save(any(Member.class));
        assertThat(saveMember1).isEqualTo(member);

        assertThatThrownBy(() -> {
            Member saveMember2 = memberService.saveMember(member);
        })
                .isInstanceOf(RuntimeException.class)
                .message().isEqualTo("롤백 테스트");
    }
}

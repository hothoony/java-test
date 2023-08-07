package com.example.mockitotest.service;

import com.example.mockitotest.domain.Member;
import com.example.mockitotest.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MemberServiceSliceTest {

    @Mock
    MemberRepository memberRepository;

    @InjectMocks
    MemberService memberService;

    @Test
    void notNull() {
        assertThat(memberRepository).isNotNull();
        assertThat(memberService).isNotNull();
    }

    @Test
    void saveMember() {
        Member expected = new Member(1L, "memberA");
        when(memberRepository.save(any(Member.class))).thenReturn(expected);

        Member member = new Member("memberA");
        Member actual = memberService.saveMember(member);

        verify(memberRepository).save(any(Member.class));
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findAll() {
        
        List<Member> members = Arrays.asList(
                new Member("memberA"),
                new Member("memberB")
        );
        when(memberRepository.findAll()).thenReturn(members);

        List<Member> actual = memberService.findAllMembers();

        verify(memberRepository).findAll();
        assertThat(actual).hasSize(members.size());
        assertThat(actual).containsExactlyElementsOf(members);
    }
}

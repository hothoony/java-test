package com.example.mockitotest.service;

import com.example.mockitotest.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@SpringBootTest
//@Transactional
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    void notNull() {
        assertThat(memberService).isNotNull();
    }

    @Test
    void saveMember() {
        
        Member member = new Member("memberA");

        Member actual = memberService.saveMember(member);

        assertThat(actual).isEqualTo(member);
    }
}

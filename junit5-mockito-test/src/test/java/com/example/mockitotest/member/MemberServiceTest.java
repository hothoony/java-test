package com.example.mockitotest.member;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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

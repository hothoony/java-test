package com.example.assertjtest;

import com.example.assertjtest.member.MemberDto;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class list_extracting_containsExactly_tuple_test {


    @Test
    void test1() {

        List<MemberDto> memberDtos = Arrays.asList(
                MemberDto.builder().memberSeq(1).memberNm("memberA").age(10).build(),
                MemberDto.builder().memberSeq(2).memberNm("memberD").age(50).build(),
                MemberDto.builder().memberSeq(3).memberNm("memberC").age(20).build(),
                MemberDto.builder().memberSeq(4).memberNm("memberE").age(40).build(),
                MemberDto.builder().memberSeq(5).memberNm("memberB").age(30).build()
        );

        assertThat(memberDtos)
                .isNotNull()
                .hasSize(5)
        ;

        assertThat(memberDtos)
                .extracting("memberSeq").containsExactly(1, 2, 3, 4, 5)
        ;

        assertThat(memberDtos)
                .extracting("age").containsExactly(10, 50, 20, 40, 30)
        ;

        assertThat(memberDtos)
                .extracting("age").containsExactlyInAnyOrder(10, 20, 30, 40, 50)
        ;

        assertThat(memberDtos)
                .extracting("memberSeq", "age")
                .containsExactly(
                        tuple(1, 10),
                        tuple(2, 50),
                        tuple(3, 20),
                        tuple(4, 40),
                        tuple(5, 30)
                )
        ;
    }
}

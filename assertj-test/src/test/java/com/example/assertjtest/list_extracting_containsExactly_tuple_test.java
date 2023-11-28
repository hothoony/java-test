package com.example.assertjtest;

import com.example.assertjtest.member.MemberDto;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class list_extracting_containsExactly_tuple_test {


    @Test
    void column1_test() {

        List<MemberDto> memberDtos = getMemberDtos();

        assertThat(memberDtos)
                .extracting("memberSeq").contains(1, 2, 3);
        
        assertThat(memberDtos)
                .extracting("memberSeq").containsExactly(1, 2, 3, 4, 5);

        assertThat(memberDtos)
                .extracting("memberSeq").containsAnyOf(3, 4, 5);

        assertThat(memberDtos)
                .extracting("memberSeq").containsExactlyInAnyOrder(5, 2, 3, 4, 1);
    }

    @Test
    void column2_test() {

        List<MemberDto> memberDtos = getMemberDtos();

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

        assertThat(memberDtos)
                .extracting("memberSeq", "age")
                .containsExactlyInAnyOrder(
                        tuple(2, 50),
                        tuple(1, 10),
                        tuple(3, 20),
                        tuple(4, 40),
                        tuple(5, 30)
                )
        ;

        assertThat(memberDtos)
                .extracting("memberSeq", "age")
                .containsAnyOf(
                        tuple(2, 50),
                        tuple(4, 40),
                        tuple(5, 30)
                )
        ;
    }

    private static List<MemberDto> getMemberDtos() {
        List<MemberDto> memberDtos = Arrays.asList(
                MemberDto.builder().memberSeq(1).memberNm("memberA").age(10).build(),
                MemberDto.builder().memberSeq(2).memberNm("memberD").age(50).build(),
                MemberDto.builder().memberSeq(3).memberNm("memberC").age(20).build(),
                MemberDto.builder().memberSeq(4).memberNm("memberE").age(40).build(),
                MemberDto.builder().memberSeq(5).memberNm("memberB").age(30).build()
        );
        return memberDtos;
    }
}

package com.example.enumtest.type;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MemberTypeCdTest {

    @Test
    void ofCode_test() {
        assertThat(MemberTypeCd.ofCode("10")).isEqualTo(MemberTypeCd.ADMIN);
        assertThat(MemberTypeCd.ofCode("20")).isEqualTo(MemberTypeCd.MEMBER);
    }

    @Test
    void test1() {
        assertThat(MemberTypeCd.MEMBER).isEqualTo(MemberTypeCd.MEMBER);
        assertThat(MemberTypeCd.MEMBER.toString()).isEqualTo("MEMBER");
        assertThat(MemberTypeCd.MEMBER.cd()).isEqualTo("20");
        assertThat(MemberTypeCd.MEMBER.nm()).isEqualTo("member");
    }

    @Test
    void test2() {

        System.out.println();
        System.out.println(MemberTypeCd.MEMBER);
        System.out.println(MemberTypeCd.MEMBER.toString());
        System.out.println(MemberTypeCd.MEMBER.cd());
        System.out.println(MemberTypeCd.MEMBER.nm());

        System.out.println();
        System.out.println(MemberTypeCd.MA0);
        System.out.println(MemberTypeCd.MA0.toString());
        System.out.println(MemberTypeCd.MA0.cd());
        System.out.println(MemberTypeCd.MA0.nm());
    }
}

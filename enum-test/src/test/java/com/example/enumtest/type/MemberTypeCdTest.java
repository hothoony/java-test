package com.example.enumtest.type;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MemberTypeCdTest {

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

    @Test
    void values_test() {
        MemberTypeCd[] values = MemberTypeCd.values();
        for (MemberTypeCd value : values) {
            System.out.println("value = " + value);
        }
    }

    @Test
    void valueOf_exist_test() {
        MemberTypeCd memberTypeCd = MemberTypeCd.valueOf("MEMBER");
        System.out.println("memberTypeCd = " + memberTypeCd);
    }

    @Test
    void valueOf_not_exist_test() {
        
        assertThatThrownBy(() -> {
            MemberTypeCd memberTypeCd = MemberTypeCd.valueOf("AA"); // java.lang.IllegalArgumentException
            System.out.println("memberTypeCd = " + memberTypeCd);
        })
        .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void ofCode_test() {
        assertThat(MemberTypeCd.ofCode("10")).isEqualTo(MemberTypeCd.ADMIN);
        assertThat(MemberTypeCd.ofCode("20")).isEqualTo(MemberTypeCd.MEMBER);
        assertThat(MemberTypeCd.ofCode("MA0")).isEqualTo(MemberTypeCd.MA0);
        assertThat(MemberTypeCd.ofCode("MB0")).isEqualTo(MemberTypeCd.MB0);
        assertThat(MemberTypeCd.ofCode("AA")).isNull();
        assertThat(MemberTypeCd.ofCode(null)).isNull();
    }
    @Test
    void ofCode2_test() {
        assertThat(MemberTypeCd.ofCode2("10")).isEqualTo(MemberTypeCd.ADMIN);
        assertThat(MemberTypeCd.ofCode2("20")).isEqualTo(MemberTypeCd.MEMBER);
        assertThat(MemberTypeCd.ofCode2("MA0")).isEqualTo(MemberTypeCd.MA0);
        assertThat(MemberTypeCd.ofCode2("MB0")).isEqualTo(MemberTypeCd.MB0);
        assertThat(MemberTypeCd.ofCode2("AA")).isEqualTo(MemberTypeCd.NONE);
        assertThat(MemberTypeCd.ofCode2(null)).isEqualTo(MemberTypeCd.NONE);
    }

    @Test
    void none_cd_is_null() {
        MemberTypeCd memberTypeCd = MemberTypeCd.NONE;
        assertThat(memberTypeCd.cd()).isNull();
    }
}

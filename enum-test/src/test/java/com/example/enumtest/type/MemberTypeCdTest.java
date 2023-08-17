package com.example.enumtest.type;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MemberTypeCdTest {

    @Test
    void ofCode_test() {
        
        assertThat(MemberTypeCd.ofCode("10")).isEqualTo(MemberTypeCd.ADMIN);
        assertThat(MemberTypeCd.ofCode("20")).isEqualTo(MemberTypeCd.MEMBER);

        assertThat(MemberTypeCd.ofCode(10)).isEqualTo(MemberTypeCd.ADMIN);
        assertThat(MemberTypeCd.ofCode(20)).isEqualTo(MemberTypeCd.MEMBER);
    }
}

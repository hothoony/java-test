package com.example.enumtest.type;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MemberTypeTest {

    @Test
    void of_memberName() {
        assertThat(MemberType.of("admin")).isEqualTo(MemberType.ADMIN);
        assertThat(MemberType.of("member")).isEqualTo(MemberType.MEMBER);
    }

    @Test
    void of_memberCode() {
        assertThat(MemberType.of(10)).isEqualTo(MemberType.ADMIN);
        assertThat(MemberType.of(20)).isEqualTo(MemberType.MEMBER);
    }
}

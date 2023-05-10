package com.example.snakecasecamelcasetest.utils;

import org.junit.jupiter.api.Test;

import static com.example.snakecasecamelcasetest.utils.CamelCaseUtil.snakeToCamel;
import static org.assertj.core.api.Assertions.assertThat;

class CamelCaseUtilTest {

    @Test
    void test() {
        assertThat(snakeToCamel("name")).isEqualTo("name");
        assertThat(snakeToCamel("reg_date")).isEqualTo("regDate");
        assertThat(snakeToCamel("group_code_nm")).isEqualTo("groupCodeNm");

        assertThat(snakeToCamel("NAME")).isEqualTo("name");
        assertThat(snakeToCamel("REG_DATE")).isEqualTo("regDate");
        assertThat(snakeToCamel("GROUP_CODE_NM")).isEqualTo("groupCodeNm");
    }
}
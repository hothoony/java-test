package com.example.mockitotest.arrayList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
public class mock_vs_spy {

    @Mock
    ArrayList mockList;

    @Spy
    ArrayList spyList;

    @Test
    void mockList_test() {

        // 메소드 호출은 되지만 실제 동작은 일어나지 않는다
        mockList.add("aa");
        assertThat(mockList.size()).isEqualTo(0);

        mockList.add("bb");
        mockList.add("cc");
        assertThat(mockList.size()).isEqualTo(0);

        // mocking 한대로 동작한다
        given(mockList.size()).willReturn(-1);
        mockList.add("dd");
        assertThat(mockList.size()).isEqualTo(-1);
    }

    @Test
    void spyList_test() {

        // 리스트에 실제로 값을 추가한다
        spyList.add("aa");
        assertThat(spyList.size()).isEqualTo(1);

        // 실제로 값이 추가됐기 때문에 size 가 늘어난다
        spyList.add("bb");
        spyList.add("cc");
        assertThat(spyList.size()).isEqualTo(3);

        spyList.add("dd");
        assertThat(spyList.size()).isEqualTo(4);
        // mocking 할 수 있다
        given(spyList.size()).willReturn(-1);
        assertThat(spyList.size()).isEqualTo(-1);
    }
}

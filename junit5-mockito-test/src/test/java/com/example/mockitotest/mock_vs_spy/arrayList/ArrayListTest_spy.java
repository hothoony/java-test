package com.example.mockitotest.mock_vs_spy.arrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
public class ArrayListTest_spy {

    @Spy
    ArrayList list;

    @Test
    void test2() {

        list.add(11);
        list.add(22);
        list.add(33);
        int size = list.size();

        assertThat(size).isEqualTo(3);
    }

    @Test
    void test1() {

        given(list.size()).willReturn(-1);

        list.add(11);
        list.add(22);
        list.add(33);
        int size = list.size();

        assertThat(size).isEqualTo(-1);
    }
}

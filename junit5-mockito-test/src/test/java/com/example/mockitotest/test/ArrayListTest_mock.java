package com.example.mockitotest.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
public class ArrayListTest_mock {

    @Mock
    ArrayList list;

    @Test
    void test1() {

        given(list.size()).willReturn(-1);

        list.add(11);
        list.add(22);
        list.add(33);
        int size = list.size();

        then(list).should().size();
        assertThat(size).isEqualTo(-1);
    }
}

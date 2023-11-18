package com.example.mockitotest.modelmapper;

import com.example.mockitotest.domain.Member;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class ModelMapperTest {

    @Mock
    ModelMapper modelMapper;

    @Test
    void test1() {

        given(modelMapper.map(any(Object.class), Member.class))
                .willReturn(new Member("memberA"));

        Member member = modelMapper.map("", Member.class);
        System.out.println("member = " + member);
    }
}

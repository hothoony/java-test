package com.example.mockitotest.modelmapper;

import com.example.mockitotest.domain.Member;
import com.example.mockitotest.dto.ReqMemberAddDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class ModelMapperTest {

    @Mock
    ModelMapper modelMapper;

    @Test
    void test2() {

        ReqMemberAddDto reqMemberAddDto = new ReqMemberAddDto("memberA");

        given(modelMapper.map(reqMemberAddDto, Member.class)).willReturn(new Member("memberB"));

        Member member = modelMapper.map(reqMemberAddDto, Member.class);
        assertThat(member.getMemberFnm()).isEqualTo("memberB");
    }

    @Test
    void test1() {

        ReqMemberAddDto reqMemberAddDto = new ReqMemberAddDto("memberA");

        Member member = modelMapper.map(reqMemberAddDto, Member.class);
        assertThat(member.getMemberFnm()).isEqualTo("memberA");
    }
}

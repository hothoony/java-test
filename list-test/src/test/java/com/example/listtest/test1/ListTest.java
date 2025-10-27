package com.example.listtest.test1;

import com.example.listtest.dto.MemberDto;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    @Test
    void test1() {

        List<MemberDto> memberList = new ArrayList<>();
        memberList.add(new MemberDto("회원 A"));
        memberList.add(new MemberDto("회원 B"));
        memberList.add(new MemberDto("회원 C"));
        printList(memberList);

        updateMobile(memberList);
        printList(memberList);

        updateNickname(memberList);
        printList(memberList);
    }

    private void updateNickname(List<MemberDto> memberList) {
        for (MemberDto memberDto : memberList) {
            memberDto.setMemberNickname("사용자 별명 1");
        }
    }

    private void updateMobile(List<MemberDto> memberList) {
        for (MemberDto memberDto : memberList) {
            memberDto.setMobilePhone("010-1234-5678");
        }
    }

    private void printList(List<MemberDto> memberList) {
        System.out.println();
        for (MemberDto memberDto : memberList) {
            System.out.println("memberDto = " + memberDto);
        }
    }
}

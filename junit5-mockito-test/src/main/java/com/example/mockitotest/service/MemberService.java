package com.example.mockitotest.service;

import com.example.mockitotest.domain.Member;
import com.example.mockitotest.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member saveMember(Member member) {
        Member saveMember = memberRepository.save(member);
        return saveMember;
    }

    public List<Member> findAllMembers() {
        List<Member> members = memberRepository.findAll();
        return members;
    }

    public Optional<Member> findMemberById(Long id) {
        Optional<Member> optionalMember = memberRepository.findById(id);
        return optionalMember;
    }

    public List<Member> findMemberByName(String name) {
        List<Member> members = memberRepository.findByName(name);
        return members;
    }
}

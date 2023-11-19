package com.example.mockitotest.service;

import com.example.mockitotest.domain.Member;
import com.example.mockitotest.dto.MemberAgreeDto;
import com.example.mockitotest.dto.MemberDto;
import com.example.mockitotest.dto.ReqMemberAddDto;
import com.example.mockitotest.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final MemberAgreeService memberAgreeService;
    private final ModelMapper modelMapper;
    private final MailService mailService;
    private final SmsService smsService;

    public Member saveMember(ReqMemberAddDto reqMemberAddDto) {

        findMemberByName(reqMemberAddDto.getMemberFnm());

        Member member = modelMapper.map(reqMemberAddDto, Member.class);
        memberRepository.save(member);

        MemberAgreeDto memberAgreeDto = modelMapper.map(reqMemberAddDto, MemberAgreeDto.class);
        memberAgreeService.saveMemberAgree(memberAgreeDto);

        mailService.sendMail("mail body content");
        smsService.sendSms("sms body content");
        
        return member;
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
        List<Member> members = memberRepository.findByMemberFnm(name);
        return members;
    }
}

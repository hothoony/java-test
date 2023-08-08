package com.example.mockitotest.service;

import com.example.mockitotest.domain.MemberAgree;
import com.example.mockitotest.dto.MemberAgreeDto;
import com.example.mockitotest.repository.MemberAgreeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberAgreeService {

    private final MemberAgreeRepository memberAgreeRepository;
    private final ModelMapper modelMapper;

    public void saveMemberAgree(MemberAgreeDto memberAgreeDto) {
        MemberAgree memberAgree = modelMapper.map(memberAgreeDto, MemberAgree.class);
        memberAgreeRepository.save(memberAgree);
    }
}

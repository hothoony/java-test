package com.example.mockitotest.service;

import com.example.mockitotest.repository.MemberAgreeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberAgreeService {

    private final MemberAgreeRepository memberAgreeRepository;
}

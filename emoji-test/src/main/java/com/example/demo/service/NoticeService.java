package com.example.demo.service;

import com.example.demo.domain.NoticeEntity;
import com.example.demo.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeRepository noticeRepository;

    public NoticeEntity createNotice(NoticeEntity noticeEntity) {
        return noticeRepository.save(noticeEntity);
    }
}

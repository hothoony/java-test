package com.example.demo.repository;

import com.example.demo.domain.NoticeEntity;
import com.example.demo.repository.db2.Db2NoticeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class Db2NoticeRepository_test {

    @Autowired
    private Db2NoticeRepository db2NoticeRepository;

    @Test
    @Transactional
    void testDb2() {
        // given
        NoticeEntity notice = new NoticeEntity();
        notice.setNoticeTitle("DB1 공지사항");

        // when
        NoticeEntity savedNotice = db2NoticeRepository.save(notice);

        // then
        assertThat(savedNotice.getNoticeId()).isNotNull();
        assertThat(savedNotice.getNoticeTitle()).isEqualTo("DB2 공지사항");
    }
}

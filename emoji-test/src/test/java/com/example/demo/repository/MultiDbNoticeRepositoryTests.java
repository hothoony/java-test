package com.example.demo.repository;

import com.example.demo.domain.NoticeEntity;
import com.example.demo.repository.db1.Db1NoticeRepository;
import com.example.demo.repository.db2.Db2NoticeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MultiDbNoticeRepositoryTests {

    @Autowired
    private Db1NoticeRepository db1NoticeRepository;

    @Autowired
    private Db2NoticeRepository db2NoticeRepository;

    @Test
    @Transactional
    void testInsertNoticeToBothDatabases() {
        // given
        NoticeEntity notice1 = new NoticeEntity();
        notice1.setNoticeTitle("DB1 공지사항");

        NoticeEntity notice2 = new NoticeEntity();
        notice2.setNoticeTitle("DB2 공지사항");

        // when
        NoticeEntity savedNotice1 = db1NoticeRepository.save(notice1);
        NoticeEntity savedNotice2 = db2NoticeRepository.save(notice2);

        // then
        assertThat(savedNotice1.getNoticeId()).isNotNull();
        assertThat(savedNotice2.getNoticeId()).isNotNull();
        assertThat(savedNotice1.getNoticeTitle()).isEqualTo("DB1 공지사항");
        assertThat(savedNotice2.getNoticeTitle()).isEqualTo("DB2 공지사항");
    }
}

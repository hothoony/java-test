package com.example.demo.repository;

import com.example.demo.domain.NoticeEntity;
import com.example.demo.repository.db1.NoticeDb1Repository;
import com.example.demo.repository.db2.NoticeDb2Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MultiDbNoticeRepositoryTests {

    @Autowired
    private NoticeDb1Repository noticeDb1Repository;

    @Autowired
    private NoticeDb2Repository noticeDb2Repository;

    @Test
    @Transactional
    void testInsertNoticeToDb1() {
        // given
        NoticeEntity notice = new NoticeEntity();
        notice.setNoticeTitle("DB1 공지사항");

        // when
        NoticeEntity savedNotice = noticeDb1Repository.save(notice);

        // then
        assertThat(savedNotice.getNoticeId()).isNotNull();
        assertThat(savedNotice.getNoticeTitle()).isEqualTo("DB1 공지사항");
    }

    @Test
    @Transactional
    void testInsertNoticeToDb2() {
        // given
        NoticeEntity notice = new NoticeEntity();
        notice.setNoticeTitle("DB2 공지사항");

        // when
        NoticeEntity savedNotice = noticeDb2Repository.save(notice);

        // then
        assertThat(savedNotice.getNoticeId()).isNotNull();
        assertThat(savedNotice.getNoticeTitle()).isEqualTo("DB2 공지사항");
    }

    @Test
    @Transactional
    void testInsertNoticeToBothDatabases() {
        // given
        NoticeEntity notice1 = new NoticeEntity();
        notice1.setNoticeTitle("DB1 공지사항");

        NoticeEntity notice2 = new NoticeEntity();
        notice2.setNoticeTitle("DB2 공지사항");

        // when
        NoticeEntity savedNotice1 = noticeDb1Repository.save(notice1);
        NoticeEntity savedNotice2 = noticeDb2Repository.save(notice2);

        // then
        assertThat(savedNotice1.getNoticeId()).isNotNull();
        assertThat(savedNotice2.getNoticeId()).isNotNull();
        assertThat(savedNotice1.getNoticeTitle()).isEqualTo("DB1 공지사항");
        assertThat(savedNotice2.getNoticeTitle()).isEqualTo("DB2 공지사항");
    }
}

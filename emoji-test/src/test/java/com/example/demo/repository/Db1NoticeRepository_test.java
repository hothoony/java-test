package com.example.demo.repository;

import com.example.demo.domain.NoticeEntity;
import com.example.demo.repository.mydb1.Db1NoticeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class Db1NoticeRepository_test {

    @Autowired
    private Db1NoticeRepository db1NoticeRepository;

    @Commit
    @Test
    void testDb1() {
        // given
        NoticeEntity notice = new NoticeEntity();
        notice.setNoticeTitle("DB1 공지사항");

        // when
        NoticeEntity savedNotice = db1NoticeRepository.save(notice);

        // then
        assertThat(savedNotice.getNoticeId()).isNotNull();
        assertThat(savedNotice.getNoticeTitle()).isEqualTo("DB1 공지사항");
    }
}

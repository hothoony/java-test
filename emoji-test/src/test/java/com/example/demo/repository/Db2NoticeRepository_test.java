package com.example.demo.repository;

import com.example.demo.domain.NoticeEntity;
import com.example.demo.repository.mydb2.Db2NoticeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class Db2NoticeRepository_test {

    @Autowired
    private Db2NoticeRepository db2NoticeRepository;

    @Commit
    @Test
    void testDb2() {
        // given
        NoticeEntity noticeEntity = new NoticeEntity();
        noticeEntity.setNoticeTitle("DB1 공지사항");

        // when
        NoticeEntity savedNoticeEntity = db2NoticeRepository.save(noticeEntity);

        // then
        assertThat(savedNoticeEntity.getNoticeId()).isNotNull();
        assertThat(savedNoticeEntity.getNoticeTitle()).isEqualTo("DB2 공지사항");
    }
}

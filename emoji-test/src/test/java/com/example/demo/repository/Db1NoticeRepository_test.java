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
        NoticeEntity noticeEntity = new NoticeEntity();
        noticeEntity.setNoticeTitle("DB1 공지사항");

        // when
        NoticeEntity savedNoticeEntity = db1NoticeRepository.save(noticeEntity);

        // then
        assertThat(savedNoticeEntity.getNoticeId()).isNotNull();
        assertThat(savedNoticeEntity.getNoticeTitle()).isEqualTo("DB1 공지사항");
    }
}

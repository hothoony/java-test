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

        String emoji3Bytes = "DB 공지사항 😀😂😍😢😎 이모지 테스트"; // 3바이트 이모지
        String emoji4Bytes = "DB 공지사항 👨‍👩‍👧‍👦🧑🏽🧑‍💻🏳️‍🌈🧑‍ 이모지 테스트"; // 4바이트 이모지

        saveTest(emoji3Bytes);
//        saveTest(emoji4Bytes);
    }

    private void saveTest(String str) {
        // given
        NoticeEntity noticeEntity = new NoticeEntity();
        noticeEntity.setNoticeTitle(str);

        // when
        NoticeEntity savedNoticeEntity = db2NoticeRepository.save(noticeEntity);

        // then
        assertThat(savedNoticeEntity.getNoticeId()).isNotNull();
        assertThat(savedNoticeEntity.getNoticeTitle()).isEqualTo(str);
    }
}

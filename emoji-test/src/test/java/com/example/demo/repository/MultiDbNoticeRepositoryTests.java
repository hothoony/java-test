package com.example.demo.repository;

import com.example.demo.domain.NoticeEntity;
import com.example.demo.repository.mydb1.Db1NoticeRepository;
import com.example.demo.repository.mydb2.Db2NoticeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
class MultiDbNoticeRepositoryTests {

    @Autowired
    private Db1NoticeRepository db1NoticeRepository;

    @Autowired
    private Db2NoticeRepository db2NoticeRepository;

    @Commit
    @Test
    void testInsertNoticeToBothDatabases() {

        String emoji3Bytes = "DB 공지사항 😀😂😍😢😎 이모지 테스트"; // 3바이트 이모지
        String emoji4Bytes = "DB 공지사항 👨‍👩‍👧‍👦🧑🏽🧑‍💻🏳️‍🌈🧑‍ 이모지 테스트"; // 4바이트 이모지

        String str = emoji3Bytes;

        // given
        NoticeEntity notice1 = new NoticeEntity();
        notice1.setNoticeTitle(str);

        NoticeEntity notice2 = new NoticeEntity();
        notice2.setNoticeTitle(str);

        // when
        NoticeEntity savedNotice1 = db1NoticeRepository.save(notice1);
        NoticeEntity savedNotice2 = db2NoticeRepository.save(notice2);

        // then
        assertThat(savedNotice1.getNoticeId()).isNotNull();
        assertThat(savedNotice2.getNoticeId()).isNotNull();
        assertThat(savedNotice1.getNoticeTitle()).isEqualTo(str);
        assertThat(savedNotice2.getNoticeTitle()).isEqualTo(str);
    }
}

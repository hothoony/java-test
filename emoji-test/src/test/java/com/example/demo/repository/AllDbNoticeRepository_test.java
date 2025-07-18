package com.example.demo.repository;

import com.example.demo.domain.NoticeEntity;
import com.example.demo.repository.mydb1.Db1NoticeRepository;
import com.example.demo.repository.mydb2.Db2NoticeRepository;
import com.example.demo.utils.EmojiUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class AllDbNoticeRepository_test {

    @Autowired
    private Db1NoticeRepository db1NoticeRepository;

    @Autowired
    private Db2NoticeRepository db2NoticeRepository;

    @Commit
    @Test
    void saveTest() {

        String emoji3Bytes = "DB 공지사항 😀😂😍😢😎이모지 테스트"; // 3바이트 이모지
        String emoji4Bytes = "DB 공지사항 👨‍👩‍👧‍👦🧑🏽🧑‍💻🏳️‍🌈🧑‍이모지 테스트"; // 4바이트 이모지

        System.out.println("remove4ByteChars emoji3Bytes = " + EmojiUtil.remove4ByteChars(emoji3Bytes));
        System.out.println("remove4ByteChars emoji4Bytes = " + EmojiUtil.remove4ByteChars(emoji4Bytes));

//        db1SaveTest(emoji3Bytes);
//        db1SaveTest(emoji4Bytes);
//
//        db2SaveTest(emoji3Bytes);
//        db2SaveTest(emoji4Bytes);
    }

    private void db1SaveTest(String str) {
        // given
        NoticeEntity noticeEntity = new NoticeEntity();
        noticeEntity.setNoticeTitle(str);

        // when
        NoticeEntity savedNoticeEntity = db1NoticeRepository.save(noticeEntity);

        // then
        assertThat(savedNoticeEntity.getNoticeId()).isNotNull();
        assertThat(savedNoticeEntity.getNoticeTitle()).isEqualTo(str);
    }

    private void db2SaveTest(String str) {
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

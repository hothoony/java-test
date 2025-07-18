package com.example.demo.repository.db2;

import com.example.demo.domain.NoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Db2NoticeRepository extends JpaRepository<NoticeEntity, Long> {
}

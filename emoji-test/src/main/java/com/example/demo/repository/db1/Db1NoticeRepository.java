package com.example.demo.repository.db1;

import com.example.demo.domain.NoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Db1NoticeRepository extends JpaRepository<NoticeEntity, Long> {
}

package com.example.demo.repository.db1;

import com.example.demo.domain.NoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeDb1Repository extends JpaRepository<NoticeEntity, Long> {
}

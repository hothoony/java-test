package com.example.mockitotest.repository;

import com.example.mockitotest.domain.MemberAgree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberAgreeRepository extends JpaRepository<MemberAgree, Long> {
    
}

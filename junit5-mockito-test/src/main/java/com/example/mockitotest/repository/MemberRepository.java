package com.example.mockitotest.repository;

import com.example.mockitotest.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByMemberFnm(String name);
}

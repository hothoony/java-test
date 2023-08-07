package com.example.mockitotest.domain;

import com.example.mockitotest.code.MemberStateCd;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter @Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;
    
    private UUID memberUuid;

    private String memberFnm;
    
    private String memberLnm;

    private Integer memberAge;
    
    private MemberStateCd memberStateCd;
    
    private LocalDateTime lastLoginTime;

    public Member(String memberFnm) {
        this.memberFnm = memberFnm;
    }

    public Member(Long memberId, String memberFnm) {
        this.memberId = memberId;
        this.memberFnm = memberFnm;
    }
}

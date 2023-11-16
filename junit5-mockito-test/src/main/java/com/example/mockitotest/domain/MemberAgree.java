package com.example.mockitotest.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "tb_member_agree")
public class MemberAgree {
    
    @Id
    private Long memberId;
    
    private String emailAgreeYn;
    
    private String smsAgreeYn;
}

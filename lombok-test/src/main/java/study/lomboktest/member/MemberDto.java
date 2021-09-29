package study.lomboktest.member;

import lombok.Data;

@Data
public class MemberDto {
    
    private Long memberId;
    private String username;
    private Integer age;

    public MemberDto(Long memberId, String username, Integer age) {
        this.memberId = memberId;
        this.username = username;
        this.age = age;
    }
}

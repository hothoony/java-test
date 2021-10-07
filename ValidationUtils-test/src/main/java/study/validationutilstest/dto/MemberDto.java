package study.validationutilstest.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {
    
    private Long memberId;
    private String username;
    private Integer age;

    public MemberDto(Long memberId, String username, Integer age) {
        this.memberId = memberId;
        this.username = username;
        this.age = age;
    }

    public MemberDto(String username) {
        this.username = username;
    }
}

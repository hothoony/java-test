package study.generictest.test.code.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {
    
    private Long id;
    private String name;
    private int age;

    public MemberDto(String name) {
        this.name = name;
    }
}

package study.generictest.test.code.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeamDto {
    
    private String name;

    public TeamDto(String name) {
        this.name = name;
    }
}

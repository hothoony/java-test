package study.securitytest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String password;
    private String roles;

    public MemberDto(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public MemberDto(String name, String password, String roles) {
        this.name = name;
        this.password = password;
        this.roles = roles;
    }

    public Member toEntity() {
        return Member.builder()
                .id(id)
                .name(name)
                .password(password)
                .build();
    }
}

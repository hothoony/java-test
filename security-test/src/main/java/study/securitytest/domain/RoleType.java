package study.securitytest.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoleType {

    ADMIN("admin user"),
    USER("normal user"),
    STAFF("staff user"),
    TEACHER("teacher user");

    private String value;
}

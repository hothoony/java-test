package com.example.reflectiontest.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class MemberDto extends WebDto {
    
    private Long id;
    public String name;
    protected Integer age;

    public MemberDto() {
    }

    public MemberDto(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

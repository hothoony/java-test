package com.example.streamtest.dto;

import lombok.Getter;

@Getter
public class MemberDto {
    
    private int id;
    private String name;

    public MemberDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

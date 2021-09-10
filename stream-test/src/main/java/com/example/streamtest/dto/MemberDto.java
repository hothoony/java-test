package com.example.streamtest.dto;

import lombok.Getter;

@Getter
public class MemberDto {
    
    private int id;
    private String name;
    private String role;

    public MemberDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public MemberDto(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
    
    public static MemberDto of(int id, String name, String role) {
        return new MemberDto(id, name, role);
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

package com.example.mockitotest.code;

public enum MemberStateCd {
    
    ACTIVE("MST001", "활동"),
    SLEEP("MST002", "휴면"),
    WITHDRAW("MST003", "탈퇴");
    
    private String code;
    private String name;

    MemberStateCd(String code, String name) {
        this.code = code;
        this.name = name;
    }
    
    public String cd() {
        return this.code;
    }
    
    public String nm() {
        return this.name;
    }
}

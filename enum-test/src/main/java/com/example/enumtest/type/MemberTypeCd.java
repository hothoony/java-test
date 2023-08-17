package com.example.enumtest.type;

public enum MemberTypeCd {

    ADMIN(10, "admin"),
    MEMBER(20, "member");

    private Integer code;
    private String name;

    MemberTypeCd(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer cd() {
        return code;
    }

    public String nm() {
        return name;
    }

    public static MemberTypeCd ofCode(Object codeObj) {
        String code = String.valueOf(codeObj);
        if (Integer.valueOf(code) == ADMIN.code) {
            return ADMIN;
        }
        else if (Integer.valueOf(code)  == MEMBER.code) {
            return MEMBER;
        }
        return null;
    }
}

package com.example.enumtest.type;

public enum MemberTypeCd {

    ADMIN("10", "admin"),
    MEMBER("20", "member"),
    
    MA0("MA0", "person"),
    MB0("MB0", "company");

    private String code;
    private String name;

    MemberTypeCd(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String cd() {
        return code;
    }

    public String nm() {
        return name;
    }

    public static MemberTypeCd ofCode(Object codeObj) {
        String code = String.valueOf(codeObj);
        if (ADMIN.code.equals(code)) {
            return ADMIN;
        }
        else if (MEMBER.code.equals(code)) {
            return MEMBER;
        }
        return null;
    }
}

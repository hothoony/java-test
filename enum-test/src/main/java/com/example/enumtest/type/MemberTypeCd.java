package com.example.enumtest.type;

public enum MemberTypeCd {

    ADMIN("10", "admin"),
    MEMBER("20", "member"),
    
    MA0("MA0", "person"),
    MB0("MB0", "company"),

    NONE(null, "NO_DATA");

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

    public static MemberTypeCd ofCode(String code) {
        try {
            MemberTypeCd[] types = MemberTypeCd.values();
            for (MemberTypeCd type : types) {
                if (type.cd().equals(code)) {
                    return type;
                }
            }
            throw new IllegalStateException();
        } catch (IllegalStateException e) {
            return null;
        }
    }

    public static MemberTypeCd ofCode2(String code) {
        try {
            MemberTypeCd[] types = MemberTypeCd.values();
            for (MemberTypeCd type : types) {
                if (type.cd() != null && type.cd().equals(code)) {
                    return type;
                }
            }
            throw new IllegalStateException();
        } catch (IllegalStateException e) {
            return MemberTypeCd.NONE;
        }
    }
}

package com.example.enumtest.type;

public enum MemberType {

    ADMIN("admin", 10),
    MEMBER("member", 20)
    ;

    private String memberName;
    private int memberCode;

    MemberType(String memberName, int memberCode) {
        this.memberName = memberName;
        this.memberCode = memberCode;
    }

    public String value() {
        return memberName();
    }

    public String memberName() {
        return memberName;
    }

    public int memberCode() {
        return memberCode;
    }

    public static MemberType of(String memberName) {
        if (memberName == null) {
            return null;
        }

        memberName = memberName.trim(). toLowerCase();
        if (MEMBER.memberName().equals(memberName)) {
            return MEMBER;
        }
        else if (ADMIN.memberName().equals(memberName)) {
            return ADMIN;
        }
        return null;
    }

    public static MemberType of(int memberCode) {
        if (memberCode == ADMIN.memberCode) {
            return ADMIN;
        }
        else if (memberCode == MEMBER.memberCode) {
            return MEMBER;
        }
        return null;
    }
}

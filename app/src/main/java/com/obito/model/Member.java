package com.obito.model;

public class Member extends BasicModel {

    /**
     * 主键
     */
    private String memberId;
    /**
     * 成员名字
     */
    private String memberName;
    /**
     * 性别：0:male;1:female;
     */
    private Integer sex;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}

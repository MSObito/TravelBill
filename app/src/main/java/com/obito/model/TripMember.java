package com.obito.model;

import java.util.List;

public class TripMember {
    /**
     * 表主键
     */
    private String relationId;
    /**
     * 旅行id
     */
    private String tripId;
    /**
     * 成员id
     */
    private String memberId;
    /**
     * 成员列表
     */
    private List<Member> memberList;

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
}

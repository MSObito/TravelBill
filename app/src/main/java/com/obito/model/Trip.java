package com.obito.model;

import java.util.List;

public class Trip extends BasicModel {

    /**
     * 主键
     */
    private String tripId;
    /**
     * 旅行名称
     */
    private String tripName;
    /**
     * 人员总数
     */
    private Integer memberCount;
    /**
     * 旅行成员
     */
    private List<TripMember> tripMemberList;

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public List<TripMember> getTripMemberList() {
        return tripMemberList;
    }

    public void setTripMemberList(List<TripMember> tripMemberList) {
        this.tripMemberList = tripMemberList;
    }
}

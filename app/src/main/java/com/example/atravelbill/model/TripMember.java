package com.example.atravelbill.model;

import java.util.List;

import lombok.Data;


@Data
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

}

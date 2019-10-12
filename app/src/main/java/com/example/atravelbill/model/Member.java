package com.example.atravelbill.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
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

}

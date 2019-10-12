package com.example.atravelbill.model;

import java.util.Date;

import lombok.Data;

@Data
public class BasicModel {
    private Date createdDate;
    private String createdUser;
    private Date updatedDate;
    private String updatedUser;
    private String isValid;
}

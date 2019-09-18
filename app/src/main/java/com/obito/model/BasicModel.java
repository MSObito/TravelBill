package com.obito.model;

import org.litepal.crud.LitePalSupport;

import java.util.Date;
import lombok.Data;

@Data
public class BasicModel extends LitePalSupport {
    private Date createdDate;
    private String createdUser;
    private Date updatedDate;
    private String updatedUser;
}

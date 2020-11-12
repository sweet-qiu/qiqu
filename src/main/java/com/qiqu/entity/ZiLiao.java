package com.qiqu.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/*
 *
 *
 *@description:
 *@author: smy
 *@time: 2020/10/24 0024 10:13
 *
 */
@Data
public class ZiLiao {
    private int zlId;
    private String zlName;
    private String typeName;
    private  String zlFengMian;
    private Date zlDate;
    private int zlRead;
    private int zlSave;
    private String tName;
    private List<ZlBody> bodies;
}

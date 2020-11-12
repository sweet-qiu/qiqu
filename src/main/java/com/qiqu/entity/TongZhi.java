package com.qiqu.entity;

import lombok.Data;

import java.util.Date;

/*
 *
 *
 *@description:
 *@author: smy
 *@time: 2020/10/24 0024 9:55
 *
 */
@Data
public class TongZhi {
    private int tuId;
    private int tzId;
    private String tzName;
    private String tzBody;
    private Date tzDate;
    private int qun;
    private int tzType;
    private int status;
    private String img;
    private String fname;
}

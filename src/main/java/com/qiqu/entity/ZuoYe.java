package com.qiqu.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ZuoYe {
    private int zyId;
    private String zyName;
    private int zyStatus;
    private Date zyData;
    private String danYuan;
    private String  grade;
    private String  clazz;
    private int send;
    private int see;
    private  int fId;
}

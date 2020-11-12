package com.qiqu.entity;

import lombok.Data;

import java.util.Date;

@Data
public class KeJian {
    private int kjId;
    private String kjName;
    private String danYuan;
    private String kjFengMian;
    private String mkIds;
    private Date creatDate;
}

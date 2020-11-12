package com.qiqu.entity;

import lombok.Data;

import java.util.List;

@Data
public class BaoGao {
    private int fId;
    private  double cAvg;
    private int fnum;
    private int ufnum;
    private String body;
    private String pingyu;
    private int allnum;
    private double tru;
    private List<Stu> stuList;
}

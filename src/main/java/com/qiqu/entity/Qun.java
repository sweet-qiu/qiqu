package com.qiqu.entity;

import lombok.Data;

import java.util.List;

@Data
public class Qun {
    private int qlId;
    private String school;
    private String qlName;
    private List<Qun> child;
}

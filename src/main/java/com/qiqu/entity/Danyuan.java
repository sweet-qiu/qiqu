package com.qiqu.entity;

import lombok.Data;

import java.util.List;

@Data
public class Danyuan {
    private int dyId;
    private String dyName;
    private List<KeJian> kJNames;
}

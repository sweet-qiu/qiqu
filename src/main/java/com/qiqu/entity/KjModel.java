package com.qiqu.entity;

import lombok.Data;

import java.util.List;

@Data
public class KjModel {
    private int mkId;
    private String mkName;
    private List<SheJi> sheJis;
    private List<YuLan> yuLans;
    private List<KjModel> child;
}

package com.qiqu.service;

import com.qiqu.util.R;

import java.util.Date;
import java.util.List;

public interface ZuoYeService {
    R getMoKuian(int xkId);
    R getHuiBen(int uId, String search, int mkId, int dyId);
    R getHistory(int uId);
    R sendAndCheck(String str, int zyId);
    R addZuoYe(String zyName, Date zyDate, int uId, List<Integer> hbIds);
    R getZyd(int uId);
    R getBaoGao(int fId);
}

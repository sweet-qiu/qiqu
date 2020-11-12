package com.qiqu.service;

import com.qiqu.util.R;

public interface ZiLiaoService {
    R  getMenu();
    R  getZiLiao(int tId, String search);
    R  getZlInfo(int zlId);

}

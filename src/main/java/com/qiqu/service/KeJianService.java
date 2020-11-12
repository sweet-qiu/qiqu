package com.qiqu.service;
import com.qiqu.entity.KeJian;
import com.qiqu.util.R;

public interface KeJianService {
    R selectBook(int xkId, int typeId);

    R selectDanYuan(int bookId);

    R selectModel(int kjId, int xkId);

    R selectYuLan(KeJian keJian);

    R selectByUid(int uId);

    R insert(int uId, KeJian keJian);
}

package com.qiqu.service;

import com.qiqu.util.R;

public interface TzService {
    R getTzList(int send, int uId);
    R signAndRead(int tzId, int uId);
    R delete(int tuId);
    R getQun();
    R send(int tzId, int uId);

}

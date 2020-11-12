package com.qiqu.service.impl;

import com.qiqu.entity.Qun;
import com.qiqu.entity.TongZhi;
import com.qiqu.mapper.TongZhiMapper;
import com.qiqu.service.TzService;
import com.qiqu.util.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TzServiceImpl implements TzService {
    @Resource
    private TongZhiMapper tongZhiMapper;
    @Override
    public R getTzList(int send, int uId) {
        List<TongZhi> tongZhi = tongZhiMapper.getTongZhi(send, uId);
        int sign = tongZhiMapper.getSign(uId);
        int read = tongZhiMapper.getRead(uId);
        return R.ok().put("list", tongZhi).put("read", read).put("sign", sign);
    }

    @Override
    public R signAndRead(int tzId, int uId) {
        int i = tongZhiMapper.signAndRead(tzId, uId);
        return i!=0?R.ok():R.error();
    }

    @Override
    public R delete(int tuId) {
        int delete = tongZhiMapper.delete(tuId);
        return delete!=0?R.ok():R.error();
    }

    @Override
    public R getQun() {
       Qun qun = tongZhiMapper.getFaQun();
        System.out.println(qun);

            List<Qun> qun2s = tongZhiMapper.getQun(qun.getQlId());
            for (Qun qun2: qun2s) {
                qun2.setChild(tongZhiMapper.getQun(qun2.getQlId()));
            }
            qun.setChild(qun2s);

        return R.ok().put("Qun", qun);
    }

    @Override
    public R send(int tzId, int uId) {
        int send = tongZhiMapper.send(uId, tzId);
        return send!=0?R.ok():R.error();
    }
}

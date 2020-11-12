package com.qiqu.service.impl;

import com.qiqu.entity.BaoGao;
import com.qiqu.entity.HuiBen;
import com.qiqu.entity.ZuoYe;
import com.qiqu.entity.ZyMokuai;
import com.qiqu.mapper.ZuoYeMapper;
import com.qiqu.service.ZuoYeService;
import com.qiqu.util.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class ZyServiceImpl implements ZuoYeService {
    @Resource
    private ZuoYeMapper zuoYeMapper;
    @Override
    public R getMoKuian(int xkId) {
        List<ZyMokuai> models = zuoYeMapper.getMkName(xkId);
        return R.ok().put("models", models);
    }

    @Override
    public R getHuiBen(int uId, String search, int mkId, int dyId) {
        List<HuiBen> huiBens = zuoYeMapper.getHuiBen(uId, search, mkId, dyId);
        return R.ok().put("huiBens", huiBens);
    }

    @Override
    public R getHistory(int uId) {
        List<HuiBen> huiBens = zuoYeMapper.useHuiBen(uId);
        return R.ok().put("huiBens", huiBens);
    }

    @Override
    public R sendAndCheck(String str,int zyId) {
        int add = zuoYeMapper.change(str,zyId);
        return add!=0?R.ok():R.error("未知错误");
    }

    @Override
    public R getBaoGao(int fId) {
        if(fId==0){
return R.error(1, "当前作业单还未完成");
        }
        BaoGao baoGao = zuoYeMapper.getBaoGao(fId);
        baoGao.setStuList(zuoYeMapper.getBgInfo(fId));
        return R.ok().put("baoGao", baoGao);
    }

    @Override
    public R addZuoYe(String zyName, Date zyDate , int uId, List<Integer> hbIds) {
        int i=0;
        for (Integer hbId : hbIds) {
            i += zuoYeMapper.addZy(hbId,uId);
        }

        int i1 = zuoYeMapper.addZyd(zyName,zyDate,uId);
        return i!=0&&i1!=0?R.ok("成功"):R.error("未知错误");
    }

    @Override
    public R getZyd(int uId) {
        List<ZuoYe> zuoYes = zuoYeMapper.getZyd(uId);
        return R.ok().put("zuoYes", zuoYes);
    }
}

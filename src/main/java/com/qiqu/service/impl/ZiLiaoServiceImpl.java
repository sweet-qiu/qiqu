package com.qiqu.service.impl;

import com.qiqu.entity.ZiLiao;
import com.qiqu.mapper.ZiLiaoMapper;
import com.qiqu.service.ZiLiaoService;
import com.qiqu.util.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ZiLiaoServiceImpl implements ZiLiaoService {
   @Resource
   private ZiLiaoMapper ziLiaoMapper;

    @Override
    public R getZiLiao(int tId, String search) {
        List<ZiLiao> ziLiaos = ziLiaoMapper.jingXuan(tId, search);
        return R.ok().put("ziLiaos", ziLiaos);
    }

    @Override
    public R getZlInfo(int zlId) {
        ZiLiao info = ziLiaoMapper.getInfo(zlId);
        info.setBodies(ziLiaoMapper.getBody(zlId));
        return R.ok().put("ziLiao", info);
    }

    @Override
    public R getMenu() {
        List<ZiLiao> menu = ziLiaoMapper.getMenu();
        return R.ok().put("menu", menu);
    }
}

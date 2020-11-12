package com.qiqu.controller;

import com.qiqu.service.ZiLiaoService;
import com.qiqu.util.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ZiLiaoController {
    @Resource
    private ZiLiaoService ziLiaoService;
    @RequestMapping("/menu/list")
    public R getMenu(){
        return ziLiaoService.getMenu();
    }
    @RequestMapping("/ziLiao/list")
    public R getZiLiao(int tId,String search){
        return  ziLiaoService.getZiLiao(tId, search);
    }
    @RequestMapping("/ziLiao/info")
    public R getZlInfo(int zlId){
        return ziLiaoService.getZlInfo(zlId);
    }
}

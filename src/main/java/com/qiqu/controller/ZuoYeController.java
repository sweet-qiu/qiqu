package com.qiqu.controller;

import com.qiqu.service.ZuoYeService;
import com.qiqu.util.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class ZuoYeController {
    @Resource
    private ZuoYeService zuoYeService;
    @RequestMapping("/zuoye/menu")
    public R getMenu(int xkId){
        return zuoYeService.getMoKuian(xkId);
    }
    @RequestMapping("/zuoye/huiben")
    public R getHuiBen(int uId,String search,int mkId,int dyId){
        return zuoYeService.getHuiBen(uId, search, mkId, dyId);
    }
    @RequestMapping("/zuoye/history")
    public R getHistory(int uId){
        return zuoYeService.getHistory(uId);
    }
    @RequestMapping("/zuoye/add")
    public R addZuoYe(String zyName, Date zyDate, int uId, List<Integer> hbIds){
        return zuoYeService.addZuoYe(zyName,zyDate, uId, hbIds);
    }
    @RequestMapping("/zuoye/list")
    public R getZyd(int uId){
        return zuoYeService.getZyd(uId);
    }
    @RequestMapping("/zuoye/baogao")
    public R getBaoGao(int fId){
        return zuoYeService.getBaoGao(fId);
    }
    @RequestMapping("/zuoye/sendorckeck")
    public R sendOrCheck(String str,int zyId){
        return zuoYeService.sendAndCheck(str,zyId);
    }

}

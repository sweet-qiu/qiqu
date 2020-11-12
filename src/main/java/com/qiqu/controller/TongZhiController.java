package com.qiqu.controller;

import com.qiqu.service.TzService;
import com.qiqu.util.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TongZhiController {
    @Resource
    private TzService tzService;

    @RequestMapping("/tongzhi/list")
    public R getTzList(int send,int uId){
        return tzService.getTzList(send, uId);
    }
    @RequestMapping("/tongzhi/qunliao")
    public R getQun(){
        return tzService.getQun();
    }
    @RequestMapping("/tongzhi/send")
    public R send(int tzId,int uId){
        return tzService.send(tzId, uId);
    }
    @RequestMapping("/tongzhi/delete")
    public R delete(int tuId){
        return tzService.delete(tuId);
    }
    @RequestMapping("/tongzhi/readAndSign")
    public R readAndSign(int tzId,int uId){
        return tzService.signAndRead(tzId,uId);
    }
}

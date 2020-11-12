package com.qiqu.controller;

import com.qiqu.entity.KeJian;
import com.qiqu.service.KeJianService;
import com.qiqu.util.R;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class KeJianController {
    @Resource
    private KeJianService keJianService;

    @RequestMapping("/keJian/list")
    public R getKeJianByUid(int uId) {
        return keJianService.selectByUid(uId);
    }

    @RequestMapping("/keJian/books")
    public R getBook(int xkId, int typeId) {
        return keJianService.selectBook(xkId, typeId);
    }

    @RequestMapping("/keJIan/danYuan")
    public R getDanYuan(int bookId) {
        return keJianService.selectDanYuan(bookId);
    }

    @RequestMapping("/keJian/models")
    public R getModels(int kjId, int xkId) {
        return keJianService.selectModel(kjId, xkId);
    }

    @RequestMapping("/keJian/insert")
    public R insert(int uId, KeJian keJian) {
        return keJianService.insert(uId, keJian);
    }
    @RequestMapping("/keJian/yuLan")
    public R insert(@RequestBody KeJian keJian) {
        return keJianService.selectYuLan(keJian);
    }

}

package com.qiu;

import com.qiqu.mapper.KeJianMapper;
import com.qiqu.service.KeJianService;
import com.qiqu.util.R;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test {
    @Resource
    KeJianService keJianService;
    @Resource
    KeJianMapper keJianMapper;
    @org.junit.Test
    public void test(){
        R r = keJianService.selectModel(1, 1);
        System.out.println(r);
    }
}

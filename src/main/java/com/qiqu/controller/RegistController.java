package com.qiqu.controller;

import com.qiqu.service.impl.RegisterServiceImpl;
import com.qiqu.util.CodeUtil;
import com.qiqu.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class RegistController {
    @Autowired
    private RegisterServiceImpl registerService;
    @Autowired
    private StringRedisTemplate redisTemplate;


    @RequestMapping("/user/getCode")
    public R getCode(String zhanghao){
        String code = CodeUtil.getCode();
        redisTemplate.opsForValue().set(zhanghao,code.toString() , 600, TimeUnit.SECONDS);
        CodeUtil.SendMail2(zhanghao, code.toString());
        return R.ok();
    }
    @RequestMapping("/user/regist")
    public R regist(String zhanghao,String password,String checkCode){
        String code = redisTemplate.opsForValue().get(zhanghao);
        if(!code.equalsIgnoreCase(checkCode)){
            return R.error(1, "验证码错误");
        }
        R regist = registerService.regist(zhanghao, password);
        return regist;
    }
}

package com.qiqu.service.impl;

import com.qiqu.entity.User;
import com.qiqu.mapper.RegistMapper;
import com.qiqu.util.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterServiceImpl {
    @Resource
    private RegistMapper registMapper;
    public R regist(String zhanghao,String password){
        User user=new User();
        int i=0;
       if(user!=null){
           i=registMapper.insertUser(zhanghao,password ,user.getUId(), 1);
       }else {
          i= registMapper.insertUser(zhanghao, password,0 , 0);
       }
       return i!=0?R.ok(): R.error(1,"未知原因注册失败");
    }
}

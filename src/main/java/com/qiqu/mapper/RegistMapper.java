package com.qiqu.mapper;

import org.apache.ibatis.annotations.Param;

public interface RegistMapper {
    int insertUser(@Param("zhanghao")String zhanghao, @Param("password")String password,@Param("uId")int uId,@Param("renzheng")int renzheng);

}

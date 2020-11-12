package com.qiqu.mapper;

import com.qiqu.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ZuoYeMapper {
    List<ZyMokuai> getMkName(@Param("xkId") int xkId);
    List<HuiBen> getHuiBen(@Param("uId") int uId, @Param("search") String search, @Param("mkId") int mkId, @Param("dyId") int dyId);
    List<HuiBen> useHuiBen(@Param("uId") int uId);
    int addZy(@Param("hbId") int hbId, @Param("uId") int uId);
    List<ZuoYe> getZyd(@Param("uId") int uId);
    int change(@Param("str") String str, @Param("zyId") int zyId);
    int addZyd(@Param("zyName") String zyName, @Param("zyDate") Date zyData, @Param("uId") int uId);
    BaoGao getBaoGao(@Param("fId") int fId);
    List<Stu> getBgInfo(@Param("fId") int fId);
}

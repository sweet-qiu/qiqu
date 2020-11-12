package com.qiqu.mapper;

import com.qiqu.entity.Qun;
import com.qiqu.entity.TongZhi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TongZhiMapper {
    List<TongZhi> getTongZhi(@Param("send") int send, @Param("uId") int uId);
    int getRead(@Param("uId") int uId);
    int getSign(@Param("uId") int uId);
    int signAndRead(@Param("tzId") int tzId, @Param("uId") int uId);
    int delete(@Param("tuId") int tuId);
    int send(@Param("uId") int uId, @Param("tzId") int tzId);
    List<Qun> getQun(@Param("qlId") int qlId);
    Qun getFaQun();
}

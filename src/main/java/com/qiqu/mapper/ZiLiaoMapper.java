package com.qiqu.mapper;

import com.qiqu.entity.ZiLiao;
import com.qiqu.entity.ZlBody;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZiLiaoMapper {
   List<ZiLiao> getMenu();
   List<ZiLiao> jingXuan(@Param("tId") int tid, @Param("search") String search);
   ZiLiao getInfo(@Param("zlId") int zlId);
   List<ZlBody> getBody(@Param("zlId") int zlId);
}

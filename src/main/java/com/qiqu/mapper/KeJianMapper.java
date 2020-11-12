package com.qiqu.mapper;

import com.qiqu.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface KeJianMapper {
    List<Book> findBook(@Param("xkId") int xkId, @Param("typeId") int typeId);

    List<Danyuan> findByBookId(@Param("bookId") int bookId);

    List<KjModel> faModel(@Param("xkId") int xkId);
    List<KeJian> getKjName(@Param("dyId") int dyId);

    List<KjModel> chModel(@Param("kjId") int kjId, @Param("mkId") int mkId);

    List<KjModel> getMkName(@Param("list") List<Integer> list);
    List<SheJi> getSheJi(@Param("mkId") int mkId);
    List<YuLan> getYuLan(@Param("mkId") int mkId);


    List<KeJian> findByuId(@Param("uId") int uId);

    int insert(@Param("uId") int uId, @Param("keJian") KeJian keJian);
}

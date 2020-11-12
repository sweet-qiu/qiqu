package com.qiqu.service.impl;

import com.qiqu.entity.*;
import com.qiqu.mapper.KeJianMapper;
import com.qiqu.service.KeJianService;
import com.qiqu.util.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class KeJianServiceImpl implements KeJianService {
    @Resource
    private KeJianMapper keJianMapper;

    @Override
    public R selectBook(int xkId, int typeId) {
        List<Book> books = keJianMapper.findBook(xkId, typeId);
        return R.ok().put("books", books);
    }

    @Override
    public R selectDanYuan(int bookId) {
        List<Danyuan> danYuans = keJianMapper.findByBookId(bookId);
        for (Danyuan danYuan : danYuans) {
            List<KeJian> keJians = keJianMapper.getKjName(danYuan.getDyId());
            danYuan.setKJNames(keJians);
        }

        return R.ok().put("danYuan", danYuans);
    }

    @Override
    public R selectModel(int kjId, int xkId) {
        List<KjModel> kjModels = keJianMapper.faModel(xkId);
        for (KjModel kjModel : kjModels) {
            List<KjModel> child = keJianMapper.chModel(kjId, kjModel.getMkId());
            kjModel.setChild(child);
        }
        return R.ok().put("models", kjModels);
    }


    @Override
    public R insert(int uId, KeJian keJian) {
        int i = keJianMapper.insert(uId, keJian);
        return i != 0 ? R.ok("添加成功") : R.error("添加失败");
    }

    @Override
    public R selectByUid(int uId) {
        List<KeJian> keJians = keJianMapper.findByuId(uId);
        return R.ok().put("keJians", keJians);
    }

    @Override
    public R selectYuLan(KeJian keJian) {
        String mkIds = keJian.getMkIds();
        List<Integer> list=new ArrayList<>();
        String[] split = mkIds.split(",");
        for (int i = 0; i < split.length; i++) {
            int i1 = Integer.parseInt(split[i]);
            System.out.println(i1);
            list.add(i1);

        }
        System.out.println(list);
        List<KjModel> models = keJianMapper.getMkName(list);
        for (KjModel kjModel : models) {
            List<SheJi> sheJi = keJianMapper.getSheJi(kjModel.getMkId());
            List<YuLan> yuLan = keJianMapper.getYuLan(kjModel.getMkId());
            kjModel.setSheJis(sheJi);
            kjModel.setYuLans(yuLan);
        }
        return R.ok().put("yuLan", models);
    }
}

package com.gongxiao.zichan.service;

import com.github.pagehelper.PageHelper;
import com.gongxiao.zichan.dao.AssetsDao;
import com.gongxiao.zichan.model.Assets;
import com.gongxiao.zichan.model.AssetsExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssetsService {
    @Resource
    AssetsDao assetsDao;
//    AssetsExample example;
//    @Autowired
    public Assets selectAssetById(int id) {
        PageHelper.startPage(1,5);
        return assetsDao.selectByPrimaryKey(id);
    }

    public List<Assets> assetsList(AssetsExample example){
        return assetsDao.selectByExample(example);
    }

    public int deleteAsset(int id) { return assetsDao.deleteByPrimaryKey(id);}

    public int modifyAsset(Assets record) { return assetsDao.updateByPrimaryKey(record);}

}

package com.gongxiao.zichan.service;

import com.gongxiao.zichan.dao.AssettypeDao;
import com.gongxiao.zichan.model.Assettype;
import com.gongxiao.zichan.model.AssettypeExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssetTypeService {
    @Resource
    AssettypeDao assettypeDao;
    public List<Assettype> assetTypeList(AssettypeExample example){
        return assettypeDao.selectByExample(example);
    }
}

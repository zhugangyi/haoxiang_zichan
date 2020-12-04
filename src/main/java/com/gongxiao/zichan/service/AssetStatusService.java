package com.gongxiao.zichan.service;

import com.gongxiao.zichan.dao.AssetstatusDao;
import com.gongxiao.zichan.model.Assetstatus;
import com.gongxiao.zichan.model.AssetstatusExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssetStatusService {

    @Resource
    AssetstatusDao assetstatusDao ;

    public List<Assetstatus> assetStatusList(AssetstatusExample example){return assetstatusDao.selectByExample(example);}

    public int insert(Assetstatus record){return  assetstatusDao.insert(record);}

    public int update(Assetstatus record){return  assetstatusDao.updateByPrimaryKey(record);}

    public int delete(int id) {return assetstatusDao.deleteByPrimaryKey(id);}
}

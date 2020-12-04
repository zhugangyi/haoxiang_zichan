package com.gongxiao.zichan.service;

import com.gongxiao.zichan.dao.CustomDao;
import com.gongxiao.zichan.model.Custom;
import com.gongxiao.zichan.model.CustomExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomService {

    @Resource
    CustomDao customDao;

    public List<Custom> areaList(CustomExample example){return customDao.selectByExample(example);}

    public int insert(Custom record){return  customDao.insert(record);}

    public int update(Custom record){return  customDao.updateByPrimaryKey(record);}

    public int delete(int id) {return customDao.deleteByPrimaryKey(id);}
}

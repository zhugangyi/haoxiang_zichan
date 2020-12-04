package com.gongxiao.zichan.service;

import com.gongxiao.zichan.dao.AreaDao;
import com.gongxiao.zichan.model.Area;
import com.gongxiao.zichan.model.AreaExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AreaService {

    @Resource
    AreaDao areaDao;

    public List<Area> areaList(AreaExample example){return areaDao.selectByExample(example);}

    public int insert(Area record){return  areaDao.insert(record);}

    public int update(Area record){return  areaDao.updateByPrimaryKey(record);}

    public int delete(int id) {return areaDao.deleteByPrimaryKey(id);}
}

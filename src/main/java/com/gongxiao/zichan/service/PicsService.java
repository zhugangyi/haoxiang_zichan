package com.gongxiao.zichan.service;

import com.gongxiao.zichan.dao.PicsDao;
import com.gongxiao.zichan.model.Pics;
import com.gongxiao.zichan.model.PicsExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PicsService {
    @Resource
    PicsDao picsDao;

    public int uploadPics(Pics record) {return picsDao.insert(record);}

    public List<Pics> selectByExample(PicsExample example){return picsDao.selectByExample(example);}

    public int deletePics(int id) { return picsDao.deleteByPrimaryKey(id);}

}

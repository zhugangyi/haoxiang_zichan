package com.gongxiao.zichan.dao;

import com.gongxiao.zichan.model.Pics;
import com.gongxiao.zichan.model.PicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicsDao {
    int countByExample(PicsExample example);

    int deleteByExample(PicsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pics record);

    int insertSelective(Pics record);

    List<Pics> selectByExampleWithBLOBs(PicsExample example);

    List<Pics> selectByExample(PicsExample example);

    Pics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pics record, @Param("example") PicsExample example);

    int updateByExampleWithBLOBs(@Param("record") Pics record, @Param("example") PicsExample example);

    int updateByExample(@Param("record") Pics record, @Param("example") PicsExample example);

    int updateByPrimaryKeySelective(Pics record);

    int updateByPrimaryKeyWithBLOBs(Pics record);

    int updateByPrimaryKey(Pics record);
}
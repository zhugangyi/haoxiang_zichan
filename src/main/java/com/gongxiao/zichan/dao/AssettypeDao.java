package com.gongxiao.zichan.dao;

import com.gongxiao.zichan.model.Assettype;
import com.gongxiao.zichan.model.AssettypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssettypeDao {
    int countByExample(AssettypeExample example);

    int deleteByExample(AssettypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Assettype record);

    int insertSelective(Assettype record);

    List<Assettype> selectByExample(AssettypeExample example);

    Assettype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Assettype record, @Param("example") AssettypeExample example);

    int updateByExample(@Param("record") Assettype record, @Param("example") AssettypeExample example);

    int updateByPrimaryKeySelective(Assettype record);

    int updateByPrimaryKey(Assettype record);
}
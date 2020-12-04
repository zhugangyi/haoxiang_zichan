package com.gongxiao.zichan.dao;

import com.gongxiao.zichan.model.Custom;
import com.gongxiao.zichan.model.CustomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomDao {
    int countByExample(CustomExample example);

    int deleteByExample(CustomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Custom record);

    int insertSelective(Custom record);

    List<Custom> selectByExample(CustomExample example);

    Custom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByExample(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByPrimaryKeySelective(Custom record);

    int updateByPrimaryKey(Custom record);
}
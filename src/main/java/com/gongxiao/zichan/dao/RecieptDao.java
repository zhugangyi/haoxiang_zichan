package com.gongxiao.zichan.dao;

import com.gongxiao.zichan.model.Reciept;
import com.gongxiao.zichan.model.RecieptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecieptDao {
    int countByExample(RecieptExample example);

    int deleteByExample(RecieptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Reciept record);

    int insertSelective(Reciept record);

    List<Reciept> selectByExample(RecieptExample example);

    Reciept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Reciept record, @Param("example") RecieptExample example);

    int updateByExample(@Param("record") Reciept record, @Param("example") RecieptExample example);

    int updateByPrimaryKeySelective(Reciept record);

    int updateByPrimaryKey(Reciept record);
}
package com.gongxiao.zichan.dao;

import com.gongxiao.zichan.model.Assetstatus;
import com.gongxiao.zichan.model.AssetstatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetstatusDao {
    int countByExample(AssetstatusExample example);

    int deleteByExample(AssetstatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Assetstatus record);

    int insertSelective(Assetstatus record);

    List<Assetstatus> selectByExample(AssetstatusExample example);

    Assetstatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Assetstatus record, @Param("example") AssetstatusExample example);

    int updateByExample(@Param("record") Assetstatus record, @Param("example") AssetstatusExample example);

    int updateByPrimaryKeySelective(Assetstatus record);

    int updateByPrimaryKey(Assetstatus record);
}
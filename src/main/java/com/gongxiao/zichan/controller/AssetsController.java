package com.gongxiao.zichan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gongxiao.zichan.model.Assets;
import com.gongxiao.zichan.model.AssetsExample;
import com.gongxiao.zichan.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Assets")
public class AssetsController {
    @Autowired
    private AssetsService assetsService;

    @ResponseBody
    @RequestMapping(value = "/selectById")
    public Assets selectAssetById(@RequestBody int id) {
        return assetsService.selectAssetById(id);
    }

    @RequestMapping(value = "/selectByExample")
    public PageInfo<Assets> assetsList(@RequestParam(value = "type" , required = false) String type,
                                                @RequestParam(value = "name" , required = false) String name,
                                                @RequestParam(value = "address" , required = false) String address,
                                                @RequestParam(value = "pageNum" , required = false) int pageNum,
                                                @RequestParam(value = "pageSize" , required = false) int pageSize)
            {//三个查询参数 资产类型 and （资产名称 or 资产地址）
                AssetsExample example = new AssetsExample();
        AssetsExample.Criteria criteria1 = example.createCriteria();
        AssetsExample.Criteria criteria2 = example.createCriteria();
        //查询分解成 （资产类型 and 资产名称） or （资产类型 and 资产地址）
        if (!(type==null || type.equals(""))){
            criteria1.andAssettypeEqualTo(type);
            criteria2.andAssettypeEqualTo(type);
        }
        if (!(name==null || name.equals(""))){
            criteria1.andNameLike("%"+name.trim()+"%");
        }
        if (!(address==null || address.equals(""))){
            criteria2.andAddressLike("%"+address.trim()+"%");
        }

        example.or(criteria2);
                PageHelper.startPage(pageNum,pageSize);
        List<Assets> assets = assetsService.assetsList(example);

        return new PageInfo<Assets>(assets);
    }
}

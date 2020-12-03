package com.gongxiao.zichan.controller;

import com.gongxiao.zichan.model.Assettype;
import com.gongxiao.zichan.model.AssettypeExample;
import com.gongxiao.zichan.service.AssetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/AssetType")
public class AssetTypeController {

    @Autowired
    AssetTypeService assetTypeService;

    @GetMapping(value = "/AssetTypeList")
    public List<Assettype> assetTypeList(){
        AssettypeExample example = new AssettypeExample();
        AssettypeExample.Criteria criteria = example.createCriteria();
        return assetTypeService.assetTypeList(example);
    }


}

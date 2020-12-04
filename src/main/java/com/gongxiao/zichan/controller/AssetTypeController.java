package com.gongxiao.zichan.controller;

import com.gongxiao.zichan.model.Assettype;
import com.gongxiao.zichan.model.AssettypeExample;
import com.gongxiao.zichan.service.AssetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/insert")
    public int insert(@RequestBody Assettype record){return assetTypeService.insert(record);}

    @RequestMapping(value = "/update")
    public int update(@RequestBody Assettype record){return assetTypeService.update(record);}

    @RequestMapping(value = "delete")
    public int delete(@RequestParam int id){return assetTypeService.delete(id);}


}

package com.gongxiao.zichan.controller;

import com.gongxiao.zichan.model.Assetstatus;
import com.gongxiao.zichan.model.AssetstatusExample;
import com.gongxiao.zichan.service.AssetStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "AssetStatus")
public class AssetStatusController {

    @Autowired
    AssetStatusService assetStatusService;

    @GetMapping(value = "/AssetStatusList")
    public List<Assetstatus> assetStatusList(){
        AssetstatusExample example = new AssetstatusExample();
        AssetstatusExample.Criteria criteria = example.createCriteria();
        return assetStatusService.assetStatusList(example);
    }

    @RequestMapping(value = "/insert")
    public int insert(@RequestBody Assetstatus record){return assetStatusService.insert(record);}

    @RequestMapping(value = "/update")
    public int update(@RequestBody Assetstatus record){return assetStatusService.update(record);}

    @RequestMapping(value = "delete")
    public int delete(@RequestParam int id){return assetStatusService.delete(id);}
}

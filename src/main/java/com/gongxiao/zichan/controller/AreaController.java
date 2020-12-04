package com.gongxiao.zichan.controller;

import com.gongxiao.zichan.model.Area;
import com.gongxiao.zichan.model.AreaExample;
import com.gongxiao.zichan.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Area")
public class AreaController {

   @Autowired
    AreaService areaService;

   @RequestMapping(value = "/list")
    public List<Area> areaList(){
       AreaExample example = new AreaExample();
       return areaService.areaList(example);
   }

   @RequestMapping(value = "/insert")
    public int insert(@RequestBody Area area){
       return areaService.insert(area);
   }
   @RequestMapping(value = "/update")
    public int update(@RequestBody Area area){
       return areaService.update(area);
   }

   @RequestMapping(value = "/delete")
    public int delete(@RequestParam int id){
       return areaService.delete(id);
   }
}

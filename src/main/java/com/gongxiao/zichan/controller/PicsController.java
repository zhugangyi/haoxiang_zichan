package com.gongxiao.zichan.controller;

import com.gongxiao.zichan.model.Pics;
import com.gongxiao.zichan.model.PicsExample;
import com.gongxiao.zichan.service.PicsService;
import com.gongxiao.zichan.util.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping(value = "/Pics")
public class PicsController {

    private ResourceLoader resourceLoader;

    @Value("${web.upload-path}")
    private String path;

    @Value("${server.port}")
    private String port;

    @Autowired
    public PicsController(ResourceLoader resourceLoader){this.resourceLoader = resourceLoader;}

    @Autowired
    private PicsService picsService;

    public PicsController() {
    }

    @RequestMapping(value = "selectByExample")
    public List<Pics> selectByExample(@RequestParam(value = "belongtoid",required = true) String belongtoid,
                                      @RequestParam(value = "belongtotable",required = true) String belongtotable){
        PicsExample example = new PicsExample();
        PicsExample.Criteria criteria = example.createCriteria();
        criteria.andBelongtoidEqualTo(belongtoid);
        criteria.andBelongtotableEqualTo(belongtotable);
        return picsService.selectByExample(example);
    }

    @RequestMapping(value = "/addPicsData",method = RequestMethod.POST)  //向数据库写入图片信息
    public @ResponseBody boolean uploadPics(@RequestBody List<Pics> pics){

        String filePath = "d:\\imgs\\"+ pics.get(0).getBelongtotable()+"\\";
        boolean added = false;

        for (int i = 0; i < pics.size(); i++) {

            if (picsService.uploadPics(pics.get(i))>0){
                added = true;
            }else{
                added = false;
            }
        }
        return added;
//        if (picsService.uploadPics(pics)>0){
//            System.out.println("数据上传成功");
//            return "上传data成功";
//        }else{
//            return "上传data是被";
//        }
    }

    @RequestMapping(value = "/uploadPics",method = RequestMethod.POST)  //上传图片
    public @ResponseBody String uploadPics1(@RequestParam("file") MultipartFile file){
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
//        String filePath = request.getSession().getServletContext().getRealPath(path);

        String filePath = "d:\\imgs\\zichan\\";
        boolean uploaded = false;


        try {
            FileUtils.upload(file.getBytes(),filePath,fileName);
            uploaded = true;
            System.out.println(file.getOriginalFilename());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (uploaded){
            return "1";
        }else{
            return "0";
        }

    }



}

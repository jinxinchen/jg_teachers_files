package com.jingguanFiles.activity.controller;

import com.jingguanFiles.activity.po.ActivityFile;
import com.jingguanFiles.activity.service.ActivityFileService;
import com.jingguanFiles.tool.UploadTool;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhouliang on 2018/3/14 0014.
 */
@Controller
@RequestMapping("uploadActivity")
public class ActivityFileController {

    @Resource(name = "activityFileService")
    ActivityFileService activityFileService;


    @RequestMapping(value = "uploadEn",method = RequestMethod.POST)
    @ResponseBody
    public void uploadRecord(@RequestParam("file") MultipartFile file,@RequestParam("id") String id,HttpServletRequest request){
        System.out.println("uuuuu");
        //检查这个文件是否存在
        ActivityFile record=activityFileService.checkFile(Integer.valueOf(id),request.getSession().getServletContext().getRealPath("/"));

        //保存文件
        int userid=record.getUserId();//(int)request.getSession().getAttribute("user_id");
        String mainPath=request.getSession().getServletContext().getRealPath("/");
        activityFileService.checkDir(mainPath+userid+"/");
        activityFileService.checkDir(mainPath+userid+"/activity/");

        String path=userid+"/activity/"+id;
        path=UploadTool.upload(file,path,request);

        //更新数据库路径
        record.setCertificate(path);

        activityFileService.uploadFile(record);

    }


}

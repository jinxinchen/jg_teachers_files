package com.jingguanFiles.sincePrize.controller;

import com.jingguanFiles.sincePrize.po.TEducateScientificEntity;
import com.jingguanFiles.sincePrize.service.SincePrizeFileService;
import com.jingguanFiles.tool.UploadTool;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhouliang on 2018/3/15 0015.
 */
@Controller
@RequestMapping("uploadSincePrize")
public class SincePrizeFileController {

    @Resource(name="sincePrizeFileService")
    SincePrizeFileService sincePrizeFileService;

    @RequestMapping("uploadFile")
    @ResponseBody
    void uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("id") String id, HttpServletRequest request){

        //检查这个文件是否存在
        TEducateScientificEntity record=sincePrizeFileService.checkFile(Integer.valueOf(id),request.getSession().getServletContext().getRealPath("/"));

        //保存文件
        int userid=record.getUserId();//(int)request.getSession().getAttribute("user_id");

        String mainPath=request.getSession().getServletContext().getRealPath("/");
        sincePrizeFileService.checkDir(mainPath+userid+"/");
        sincePrizeFileService.checkDir(mainPath+userid+"/sincePrize/");


        String path=userid+"/sincePrize/"+id;

        path=UploadTool.upload(file,path,request);

        //更新数据库路径
        record.setEvidencePath(path);
        record.setFileName(file.getOriginalFilename());
        sincePrizeFileService.uploadFile(record);

    }
}

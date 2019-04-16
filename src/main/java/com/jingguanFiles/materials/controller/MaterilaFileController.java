package com.jingguanFiles.materials.controller;

import com.jingguanFiles.materials.po.TTeachingMaterialEntity;
import com.jingguanFiles.materials.service.MaterialsFileService;
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
@RequestMapping("uploadMaterials")
public class MaterilaFileController {

    @Resource(name = "materialsFileService")
    MaterialsFileService materialsFileService;

    @RequestMapping("uploadMa")
    @ResponseBody
    void upload(@RequestParam("file") MultipartFile file, @RequestParam("id") String id, HttpServletRequest request){
        System.out.println("mmmmmmmm"+id);
        //检查这个文件是否存在
        TTeachingMaterialEntity record=materialsFileService.checkFile(Integer.valueOf(id),request.getSession().getServletContext().getRealPath("/"));

        //保存文件
        int userid=record.getUserId();//(int)request.getSession().getAttribute("user_id");
        String mainPath=request.getSession().getServletContext().getRealPath("/");
        materialsFileService.checkDir(mainPath+userid+"/");
        materialsFileService.checkDir(mainPath+userid+"/materials/");


        String path=userid+"/materials/"+id;
        path=UploadTool.upload(file,path,request);

        //更新数据库路径
        record.setFile(path);

        materialsFileService.uploadFile(record);

    }
}

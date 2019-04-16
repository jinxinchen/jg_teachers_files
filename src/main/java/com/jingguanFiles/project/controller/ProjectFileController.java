package com.jingguanFiles.project.controller;

import com.jingguanFiles.project.po.TScientificEntity;
import com.jingguanFiles.project.service.ProjectFileService;
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
@RequestMapping("uploadProject")
public class ProjectFileController {

    @Resource(name="projectFileService")
    ProjectFileService projectFileService;

    //上传立项书
    @RequestMapping("uploadCreate")
    @ResponseBody
    void uploadCreate(@RequestParam("file") MultipartFile file, @RequestParam("id") String id, HttpServletRequest request){
        System.out.println("uuuuu");
        //检查这个文件是否存在
        TScientificEntity record=projectFileService.checkCreateFile(Integer.valueOf(id),request.getSession().getServletContext().getRealPath("/"));

        //保存文件
        //int userid=record.getUserId();//(int)request.getSession().getAttribute("user_id");
        String mainPath=request.getSession().getServletContext().getRealPath("/");
        projectFileService.checkDir(mainPath+"project/");
        projectFileService.checkDir(mainPath+"project/"+id+"/");

        String path="project/"+id+"/";
        path=path+"立项书";

        path=UploadTool.upload(file,path,request);

        //更新数据库路径
        record.setCreateScientificEvidenceSrc(path);

        projectFileService.uploadCreateFile(record);

    }

    //上传结项书
    @RequestMapping("uploadEnd")
    @ResponseBody
    void uploadEnd(@RequestParam("file") MultipartFile file, @RequestParam("id") String id, HttpServletRequest request){
        System.out.println("uuuuu");
        //检查这个文件是否存在
        TScientificEntity record=projectFileService.checkEndFile(Integer.valueOf(id),request.getSession().getServletContext().getRealPath("/"));

        //保存文件
        //int userid=(int)request.getSession().getAttribute("user_id");

        String mainPath=request.getSession().getServletContext().getRealPath("/");
        projectFileService.checkDir(mainPath+"project/");
        projectFileService.checkDir(mainPath+"project/"+id+"/");

        String path="project/"+id+"/";
        path=path+"end";

        path=UploadTool.upload(file,path,request);

        //更新数据库路径
        record.setEndScientificEvidenceSrc(path);

        projectFileService.uploadEndFile(record);

    }
}

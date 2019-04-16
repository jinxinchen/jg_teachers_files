package com.jingguanFiles.degree.controller;

import com.jingguanFiles.degree.po.TEducateDegreeEntity;
import com.jingguanFiles.degree.service.DegreeInfoService;
import com.jingguanFiles.upload.uploadImage;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 陈 on 2017/11/5.
 */
@Controller
@RequestMapping("degree")
public class DegreeController extends uploadImage {

    @Resource(name = "degreeInfoService")
    private DegreeInfoService degreeInfoService;

    //上传文件
    @RequestMapping("uploadDegree")
    @ResponseBody
    void uploadFile(@RequestParam("file") MultipartFile file, int id,int user_id,HttpServletRequest request){
//        int user_id = (int) request.getSession().getAttribute("user_id");
//        int id = (int) request.getSession().getAttribute("degree_id");
        String path = "degree";

        String fileName = upload(file,path,user_id,request);
        String filename = file.getOriginalFilename();//不带路径
        System.out.println(fileName);
        System.out.println(id);
        degreeInfoService.uploadFile(fileName,filename,id,user_id);

    }


    //导师文件上传
    @RequestMapping("uploadDegreeMentor")
    @ResponseBody
    void uploadDegreeMentor(@RequestParam("file") MultipartFile file, int id,int user_id,HttpServletRequest request){
//        int user_id = (int) request.getSession().getAttribute("user_id");
//        int id = (int) request.getSession().getAttribute("degree_id");
        String path = "degreeMentor";

        String fileName = upload(file,path,user_id,request);
        String filename = file.getOriginalFilename();//不带路径
        System.out.println(fileName);
        System.out.println(id);
        degreeInfoService.uploadMentorFile(fileName,filename,id,user_id);
    }

}

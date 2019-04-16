package com.jingguanFiles.baseInfo.controller;

import com.jingguanFiles.upload.uploadImage;
import com.jingguanFiles.baseInfo.service.BaseInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 陈 on 2018/3/13.
 */
@Controller
@RequestMapping("baseInfoFile")
public class BaseInfoFileController extends uploadImage {

    @Resource(name = "baseInfoServiceFile")
    private BaseInfoService baseInfoSerivce;

    @RequestMapping("uploadPic")
    @ResponseBody
    void uploadFile(@RequestParam("file") MultipartFile file, int id,int user_id, HttpServletRequest request){
        //System.out.println("user_idFile:"+user_id);
        String path = "personalPic";
        String fileName = upload(file,path,user_id,request);
//        String filename = baseInfo.getOriginalFilename();//不带路径
        baseInfoSerivce.uploadFile(fileName,id);

    }

    @RequestMapping("uploadIdentityPic")
    @ResponseBody
    void uploadIdentityFile(@RequestParam("file") MultipartFile file, int id,int user_id, HttpServletRequest request){
        System.out.println(id+"---userId--"+user_id);
        String path = "personalIdentityPic";
        String fileName = upload(file,path,user_id,request);
//        String filename = baseInfo.getOriginalFilename();//不带路径
        System.out.println(fileName);
        baseInfoSerivce.uploadIdentityFile(fileName,id);

    }
    @RequestMapping("uploadDegreeCard")
    @ResponseBody
    void uploadDegreeCard(@RequestParam("file") MultipartFile file, int id,int user_id, HttpServletRequest request){
        String path = "degreeCard";
        String fileName = upload(file,path,user_id,request);
        System.out.println(fileName);
//        String filename = baseInfo.getOriginalFilename();//不带路径
        baseInfoSerivce.uploadDegreeCard(fileName,id);

    }



    @RequestMapping("test")
    @ResponseBody
    void test(@RequestParam("file") MultipartFile file, int id,int user_id,HttpServletRequest request){
        System.out.println("test success");
        System.out.println("id:"+id);
        System.out.println("user_id"+user_id);

    }
}

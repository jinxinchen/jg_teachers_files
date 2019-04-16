package com.jingguanFiles.student.controller;

//import com.jingguanFiles.download.downLoadController;
//import com.jingguanFiles.uploadExcel.controller.test2;

import com.jingguanFiles.student.service.StudentService;
import com.jingguanFiles.upload.uploadImage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 陈 on 2018/12  /17.
 */
@Controller
@RequestMapping("student")
public class StudentController extends uploadImage {

    @Resource(name = "studentService")
    private StudentService studentService;





    //上传文件award
    @RequestMapping("uploadStudent")
    @ResponseBody
    void uploadFile(@RequestParam("file") MultipartFile file, int id,int user_id,  HttpServletRequest request){

        String path = "student";

        String fileName = upload(file,path,user_id,request);
        String filename = file.getOriginalFilename();//不带路径
        System.out.println(fileName);
        System.out.println(id);
        studentService.uploadFile(fileName,filename,id,user_id);

    }

    //上传文件issbn
    @RequestMapping("uploadStudentIssbn")
    @ResponseBody
    void uploadIssbnFile(@RequestParam("file") MultipartFile file, int id,int user_id,  HttpServletRequest request){

        String path = "article";

        String fileName = upload(file,path,user_id,request);
        String filename = file.getOriginalFilename();//不带路径
        System.out.println(fileName);
        System.out.println(id);
        studentService.uploadIssbnFile(fileName,filename,id,user_id);

    }

    //上传文件研究生竞赛
    @RequestMapping("uploadJingsai")
    @ResponseBody
    void uploadJingsai(@RequestParam("file") MultipartFile file, int id,int user_id,  HttpServletRequest request){

        String path = "jingsai";

        String fileName = upload(file,path,user_id,request);
        String filename = file.getOriginalFilename();//不带路径
        System.out.println(fileName);
        System.out.println(id);
        studentService.uploadJingsaiFile(fileName,filename,id,user_id);

    }




}

package com.jingguanFiles.copyRight.controller;

import com.jingguanFiles.copyRight.service.CopyRightService;
//import com.jingguanFiles.download.downLoadController;
//import com.jingguanFiles.uploadExcel.controller.test2;
import com.jingguanFiles.upload.uploadImage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 陈 on 2017/11/11.
 */
@Controller
@RequestMapping("copyRight")
public class CopyRightController extends uploadImage {

    @Resource(name = "copyRightService")
    private CopyRightService copyRightService;





    //上传文件
    @RequestMapping("uploadCopyRight")
    @ResponseBody
    void uploadFile(@RequestParam("file") MultipartFile file, int id,int user_id,  HttpServletRequest request){

        String path = "copyRight";

        String fileName = upload(file,path,user_id,request);
        String filename = file.getOriginalFilename();//不带路径
        System.out.println(fileName);
        System.out.println(id);
        copyRightService.uploadFile(fileName,filename,id,user_id);

    }






}

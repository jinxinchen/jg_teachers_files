package com.jingguanFiles.article.controller;

import com.jingguanFiles.article.service.ArticleService;
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
@RequestMapping("article")
public class ArticleController extends uploadImage {

    @Resource(name = "articleService")
    private ArticleService articleService;

    //上传文件
    @RequestMapping("uploadArticle")
    @ResponseBody
    void uploadFile(@RequestParam("file") MultipartFile file, int id,int user_id,  HttpServletRequest request){

        String path = "article";

        String fileName = upload(file,path,user_id,request);
        String filename = file.getOriginalFilename();//不带路径
        System.out.println(fileName);
        System.out.println(id);
        articleService.uploadFile(fileName,filename,id,user_id);

    }






}

package com.jingguanFiles.upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by 陈 on 2017/10/28.
 */
@Controller
@RequestMapping("imageUpload")
public class uploadImage {

    @RequestMapping("/Upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file,String path, int user_id, HttpServletRequest request){
        //1级目录,user_id
        String uploadUrl1 = request.getSession().getServletContext().getRealPath("/") + user_id + "/";
        //判断相应路径是否存在，不存在则创建
        File dir1 = new File(uploadUrl1);
        if(!dir1.exists()){
            dir1.mkdir();
        }

        String uploadUrl = request.getSession().getServletContext().getRealPath("/") +user_id+"/"+path + "/";
        String filename = file.getOriginalFilename();

        //判断相应路径是否存在，不存在则创建
        File dir = new File(uploadUrl);
        if(!dir.exists()){
            dir.mkdir();
        }

        System.out.println("文件上传到：" + uploadUrl + filename);
        File targetFile = new File(uploadUrl + filename);
        if(!targetFile.exists()){
            try {
                targetFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //移动上传文件
        try {
            file.transferTo(targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("http://127.0.0.1:8099/teachers_files/"+path+"/" + filename);
        //String imageSrc = "http://192.168.213.253:8099/teachers_files/"+user_id+"/"+path+"/" + filename;
        String imageSrc = "http://192.168.213.253:8099/teachers_files/"+user_id+"/"+path+"/" + filename;
        return imageSrc;
    }
}

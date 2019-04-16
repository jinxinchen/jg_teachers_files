package com.jingguanFiles.tool;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by zhouliang on 2018/3/14 0014.
 */
public class UploadTool {
    public static String upload(MultipartFile file,String path, HttpServletRequest request){
        String uploadUrl = request.getSession().getServletContext().getRealPath("/") + path+"/";
        String filename = file.getOriginalFilename();
        System.out.println("-----------------------");
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

        System.out.println("http://192.168.213.253:8099/teachers_files/"+path+"/" + filename);

        String imageSrc = "http://192.168.213.253:8099/teachers_files/"+path+"/" + filename;

        return imageSrc;
    }

}

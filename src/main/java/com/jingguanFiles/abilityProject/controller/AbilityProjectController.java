package com.jingguanFiles.abilityProject.controller;

import com.jingguanFiles.abilityProject.po.TAbilityProjectEntity;
import com.jingguanFiles.abilityProject.service.AbilityProjectService;
import com.jingguanFiles.common.vo.Page;
import com.jingguanFiles.upload.uploadImage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 陈 on 2017/11/18.
 */
@Controller
@RequestMapping("abilityProject")
public class AbilityProjectController extends uploadImage {

    @Resource(name = "abilityProjectService")
    private AbilityProjectService abilityProjectService;


    @RequestMapping("uploadAbility")
    @ResponseBody
    void uploadFile(@RequestParam("file") MultipartFile file, int user_id,HttpServletRequest request, int id){
        String path = "abilityProject";
        String fileUrl = upload(file,path,user_id,request);
        String filename = file.getOriginalFilename();//不带路径
        System.out.println(fileUrl);
        System.out.println(id);
        abilityProjectService.uploadFile(fileUrl,filename,id,user_id);

    }

}

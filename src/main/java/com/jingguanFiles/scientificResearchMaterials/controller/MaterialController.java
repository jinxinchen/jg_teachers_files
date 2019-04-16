package com.jingguanFiles.scientificResearchMaterials.controller;

import com.jingguanFiles.common.vo.Page;
import com.jingguanFiles.common.vo.ResponseWrapper;
import com.jingguanFiles.scientificResearchMaterials.po.TScientificresearchmaterialsEntity;
import com.jingguanFiles.scientificResearchMaterials.service.MaterialService;
//import com.jingguanFiles.uploadImage.controller.uploadImage;

import com.jingguanFiles.tool.UploadTool;
import com.jingguanFiles.upload.uploadImage;
import jxl.write.WriteException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 陈 on 2017/12/10.
 */
@Controller
@RequestMapping("scientificResearchMaterials")
public class MaterialController extends uploadImage {

    @Resource(name = "materialService")
    private MaterialService materialService;


    @RequestMapping("uploadMaterial")
    @ResponseBody
    void uploadMaterial(@RequestParam("file") MultipartFile file, HttpServletRequest request, int id, int user_id){
        String path = "scientificResearchMaterials";

        String fileName = upload(file,path,user_id,request);
        String filename = file.getOriginalFilename();//不带路径
        materialService.uploadFile(fileName,filename,id,user_id);
    }

}

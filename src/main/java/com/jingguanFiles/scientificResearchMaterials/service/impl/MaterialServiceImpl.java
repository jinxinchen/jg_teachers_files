package com.jingguanFiles.scientificResearchMaterials.service.impl;

import com.jingguanFiles.common.vo.Page;
import com.jingguanFiles.scientificResearchMaterials.dao.MaterialDao;
import com.jingguanFiles.scientificResearchMaterials.po.TScientificresearchmaterialsEntity;
import com.jingguanFiles.scientificResearchMaterials.service.MaterialService;
import jxl.write.WriteException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by 陈 on 2017/12/10.
 */
@Service("materialService")
public class MaterialServiceImpl implements MaterialService {

    @Resource(name = "materialDao")
    private MaterialDao materialDao;


    @Override
    public void uploadFile(String fileName, String filename, int id, int user_id) {
        materialDao.uploadFile(fileName,filename,id, user_id);
    }


}

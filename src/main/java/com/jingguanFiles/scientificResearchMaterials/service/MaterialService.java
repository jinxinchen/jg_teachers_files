package com.jingguanFiles.scientificResearchMaterials.service;

import com.jingguanFiles.common.vo.Page;
import com.jingguanFiles.scientificResearchMaterials.po.TScientificresearchmaterialsEntity;

/**
 * Created by 陈 on 2017/12/10.
 */
public interface MaterialService{
    void uploadFile(String fileName, String filename, int id, int user_id);
}

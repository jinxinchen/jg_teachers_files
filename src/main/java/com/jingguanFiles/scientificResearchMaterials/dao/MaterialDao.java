package com.jingguanFiles.scientificResearchMaterials.dao;

import com.jingguanFiles.common.vo.Page;
import com.jingguanFiles.scientificResearchMaterials.po.TScientificresearchmaterialsEntity;

import java.util.List;

/**
 * Created by 陈 on 2017/12/10.
 */
public interface MaterialDao {
    void uploadFile(String fileName, String filename, int id, int user_id);
}

package com.jingguanFiles.materials.dao;

import com.jingguanFiles.materials.po.TTeachingMaterialEntity;

/**
 * Created by zhouliang on 2018/3/14 0014.
 */
public interface MaterialsFileDao {

    void update(TTeachingMaterialEntity record);
    TTeachingMaterialEntity getRecordById(int id);

}

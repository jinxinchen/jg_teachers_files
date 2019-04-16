package com.jingguanFiles.project.dao;

import com.jingguanFiles.project.po.TScientificEntity;

/**
 * Created by zhouliang on 2018/3/14 0014.
 */
public interface ProjectFileDao {

   // void updateCreate(TScientificEntity record);

    void update(TScientificEntity record);

    TScientificEntity getRecordById(int id);

}

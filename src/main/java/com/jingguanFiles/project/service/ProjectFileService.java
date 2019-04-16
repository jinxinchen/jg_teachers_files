package com.jingguanFiles.project.service;

import com.jingguanFiles.project.po.TScientificEntity;

/**
 * Created by zhouliang on 2018/3/14 0014.
 */
public interface ProjectFileService {

    //判断目录是否存在，若不存在则创建目录
    void checkDir(String path);

    //判断是否有记录，若有则将记录删除，id是指记录的id，同时获得记录
    TScientificEntity checkCreateFile(int id, String path);//检查立项书
    TScientificEntity checkEndFile(int id, String path);//检查结项书

    //获得记录
    TScientificEntity getRecord(int id);

    //修改数据库
    void uploadCreateFile(TScientificEntity record);//立项书修改
    void uploadEndFile(TScientificEntity record);//结项书修改

}

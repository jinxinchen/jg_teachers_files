package com.jingguanFiles.activity.service;

import com.jingguanFiles.activity.po.ActivityFile;

/**
 * Created by zhouliang on 2018/3/14 0014.
 */
public interface ActivityFileService {

    //判断目录是否存在，若不存在则创建目录
    void checkDir(String path);

    //判断是否有记录，若有则将记录删除，id是指记录的id，同时获得记录
    ActivityFile checkFile(int id, String realypath);

    //获得记录
    ActivityFile getRecord(int id);

    //修改数据库
    void uploadFile(ActivityFile record);

}

package com.jingguanFiles.activity.dao;

import com.jingguanFiles.activity.po.ActivityFile;

/**
 * Created by zhouliang on 2018/3/14 0014.
 */
public interface ActivityFileDao {

    void update(ActivityFile record);
    ActivityFile getRecordById(int id);

}

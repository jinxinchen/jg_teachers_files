package com.jingguanFiles.degree.dao;

import com.jingguanFiles.degree.po.TEducateDegreeEntity;

/**
 * Created by 陈 on 2017/11/10.
 */
public interface UpdateDegreeInfoDao {
    void uploadFile(String fileName, String filename, int id, int user_id);
    void uploadMentorFile(String fileName, String filename, int id, int user_id);
}

package com.jingguanFiles.student.dao;

/**
 * Created by 陈 on 2017/11/11.
 */
public interface StudentDao {
    void uploadFile(String fileName, String filename, int id, int user_id);
    void uploadIssbnFile(String fileName, String filename, int id, int user_id);
    void uploadJingsaiFile(String fileName, String filename, int id, int user_id);
}

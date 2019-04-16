package com.jingguanFiles.baseInfo.dao;

/**
 * Created by 陈 on 2017/10/23.
 */
public interface UpdateBaseInfoDao {
    void uploadFile(String fileName, int id);
    void uploadIdentityFile(String fileName, int id);
    void uploadDegreeCart(String fileName, int id);
}

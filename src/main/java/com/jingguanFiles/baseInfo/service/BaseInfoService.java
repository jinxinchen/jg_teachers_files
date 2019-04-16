package com.jingguanFiles.baseInfo.service;

/**
 * Created by 陈 on 2017/10/13.
 */
public interface BaseInfoService {
    void uploadFile(String fileName, int id);
    void uploadIdentityFile(String fileName, int id);
    void uploadDegreeCard(String fileName, int id);
}

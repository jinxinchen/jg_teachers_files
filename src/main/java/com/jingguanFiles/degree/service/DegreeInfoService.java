package com.jingguanFiles.degree.service;

import com.jingguanFiles.degree.po.TEducateDegreeEntity;

import java.util.List;

/**
 * Created by 陈 on 2017/11/7.
 */
public interface DegreeInfoService {
    void uploadFile(String fileName, String filename, int id, int user_id);
    void uploadMentorFile(String fileName, String filename, int id, int user_id);
}

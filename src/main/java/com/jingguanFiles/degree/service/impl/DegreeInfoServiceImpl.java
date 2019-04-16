package com.jingguanFiles.degree.service.impl;

import com.jingguanFiles.degree.dao.UpdateDegreeInfoDao;
import com.jingguanFiles.degree.po.TEducateDegreeEntity;
import com.jingguanFiles.degree.service.DegreeInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈 on 2017/11/7.
 */
@Service("degreeInfoService")
public class DegreeInfoServiceImpl implements DegreeInfoService{

    @Resource(name = "updateDegreeInfo")
    private UpdateDegreeInfoDao updateDegreeInfoDao;

    @Override
    public void uploadFile(String fileName, String filename, int id, int user_id) {
        updateDegreeInfoDao.uploadFile(fileName,filename,id,user_id);
    }

    @Override
    public void uploadMentorFile(String fileName, String filename, int id, int user_id) {
        updateDegreeInfoDao.uploadMentorFile(fileName,filename,id,user_id);
    }


}

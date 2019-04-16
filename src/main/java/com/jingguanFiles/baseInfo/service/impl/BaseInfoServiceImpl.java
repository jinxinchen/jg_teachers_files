package com.jingguanFiles.baseInfo.service.impl;

import com.jingguanFiles.baseInfo.dao.UpdateBaseInfoDao;
import com.jingguanFiles.baseInfo.service.BaseInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 陈 on 2017/10/13.
 */
@Service("baseInfoServiceFile")
public class BaseInfoServiceImpl implements BaseInfoService {

    @Resource(name = "updateBaseInfoDao")
    private UpdateBaseInfoDao updateBaseInfoDao;



    @Override
    public void uploadFile(String fileName, int id) {
        updateBaseInfoDao.uploadFile(fileName,id);
    }

    @Override
    public void uploadIdentityFile(String fileName, int id) {
        updateBaseInfoDao.uploadIdentityFile(fileName,id);
    }

    @Override
    public void uploadDegreeCard(String fileName, int id) {
        updateBaseInfoDao.uploadDegreeCart(fileName,id);
    }
}

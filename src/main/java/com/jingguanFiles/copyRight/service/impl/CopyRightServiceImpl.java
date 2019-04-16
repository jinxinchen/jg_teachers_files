package com.jingguanFiles.copyRight.service.impl;

import com.jingguanFiles.copyRight.dao.CopyRightDao;
import com.jingguanFiles.copyRight.service.CopyRightService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 陈 on 2017/11/11.
 */
@Service("copyRightService")
public class CopyRightServiceImpl implements CopyRightService{

    @Resource(name = "copyRightDao")
    private CopyRightDao copyRightDao;


    @Override
    public void uploadFile(String fileName,String filename, int id, int user_id) {
        System.out.println("service");
        copyRightDao.uploadFile(fileName,filename,id,user_id);
    }




}

package com.jingguanFiles.student.service.impl;

import com.jingguanFiles.student.dao.StudentDao;
import com.jingguanFiles.student.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 陈 on 2017/11/11.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource(name = "studentDao")
    private StudentDao studentDao;


    @Override
    public void uploadFile(String fileName,String filename, int id, int user_id) {
        studentDao.uploadFile(fileName,filename,id,user_id);
    }

    @Override
    public void uploadIssbnFile(String fileName, String filename, int id, int user_id) {
        studentDao.uploadIssbnFile(fileName,filename,id,user_id);
    }

    @Override
    public void uploadJingsaiFile(String fileName, String filename, int id, int user_id) {
        studentDao.uploadJingsaiFile(fileName,filename,id,user_id);
    }


}

package com.jingguanFiles.student.dao.impl;

import com.jingguanFiles.common.impl.BaseDao;
import com.jingguanFiles.student.dao.StudentDao;
import com.jingguanFiles.student.po.TPostgraduateJingsaiEntity;
import com.jingguanFiles.student.po.TStudentEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 陈 on 2017/11/11.
 */
@Repository("studentDao")
public class StudentDaoImpl extends BaseDao implements StudentDao {


    @Override
    public void uploadFile(String fileName, String filename, int id, int user_id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();

        TStudentEntity tStudentEntity = session.load(TStudentEntity.class,id);
        System.out.println("sss"+fileName);
        System.out.println("qweqwe::::::"+tStudentEntity.getId());
        tStudentEntity.setAwardFileSrc(fileName);
        tStudentEntity.setAwardFileName(filename);

//        Date dNow = new Date();
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        tStudentEntity.setUploadTime(ft.format(dNow).toString());

        session.update(tStudentEntity);
        transaction.commit();

    }

    @Override
    public void uploadIssbnFile(String fileName, String filename, int id, int user_id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();

        TStudentEntity tStudentEntity = session.load(TStudentEntity.class,id);
        System.out.println("sss"+fileName);
        System.out.println("qweqwe::::::"+tStudentEntity.getId());
        tStudentEntity.setIssnFileSrc(fileName);
        tStudentEntity.setIssnFileName(filename);

//        Date dNow = new Date();
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        tStudentEntity.setUploadTime(ft.format(dNow).toString());

        session.update(tStudentEntity);
        transaction.commit();
    }

    @Override
    public void uploadJingsaiFile(String fileName, String filename, int id, int user_id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();

        TPostgraduateJingsaiEntity tPostgraduateJingsaiEntity = session.load(TPostgraduateJingsaiEntity.class,id);
        System.out.println("sss"+fileName);
        System.out.println("qweqwe::::::"+tPostgraduateJingsaiEntity.getId());
        tPostgraduateJingsaiEntity.setFileSrc(fileName);
        tPostgraduateJingsaiEntity.setFileName(filename);

//        Date dNow = new Date();
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        tStudentEntity.setUploadTime(ft.format(dNow).toString());

        session.update(tPostgraduateJingsaiEntity);
        transaction.commit();
    }


}

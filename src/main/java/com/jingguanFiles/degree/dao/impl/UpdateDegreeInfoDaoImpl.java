package com.jingguanFiles.degree.dao.impl;

import com.jingguanFiles.common.impl.BaseDao;
import com.jingguanFiles.degree.dao.UpdateDegreeInfoDao;
import com.jingguanFiles.degree.po.TEducateDegreeEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 陈 on 2017/11/10.
 */
@Repository("updateDegreeInfo")
public class UpdateDegreeInfoDaoImpl extends BaseDao implements UpdateDegreeInfoDao{


    @Override
    public void uploadFile(String fileName, String filename, int id, int user_id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();

        TEducateDegreeEntity tEducateDegreeEntity = session.load(TEducateDegreeEntity.class,id);
        System.out.println(fileName);
        tEducateDegreeEntity.setEducateDegreeSrc(fileName);
        tEducateDegreeEntity.setFileName(filename);

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        tEducateDegreeEntity.setUploadTime(ft.format(dNow).toString());

        session.update(tEducateDegreeEntity);
        transaction.commit();
    }

    @Override
    public void uploadMentorFile(String fileName, String filename, int id, int user_id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();

        TEducateDegreeEntity tEducateDegreeEntity = session.load(TEducateDegreeEntity.class,id);
        System.out.println(fileName);
        tEducateDegreeEntity.setMentorEvidenceSrc(fileName);
        tEducateDegreeEntity.setMentorFileName(filename);

//        Date dNow = new Date();
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        tEducateDegreeEntity.setMentorUploadTime(ft.format(dNow).toString());

        session.update(tEducateDegreeEntity);
        transaction.commit();
    }


}

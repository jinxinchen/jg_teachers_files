package com.jingguanFiles.baseInfo.dao.impl;

import com.jingguanFiles.baseInfo.dao.UpdateBaseInfoDao;
import com.jingguanFiles.baseInfo.po.TEducationExperienceEntity;
import com.jingguanFiles.common.impl.BaseDao;
import com.jingguanFiles.baseInfo.po.TTeacherBaseinfoEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 陈 on 2017/10/23.
 */
@Repository("updateBaseInfoDao")
public class UpdateBaseInfoDaoImpl extends BaseDao implements UpdateBaseInfoDao{


    @Override
    public void uploadFile(String fileName, int id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("id is "+id);
        TTeacherBaseinfoEntity tTeacherBaseinfoEntity = session.load(TTeacherBaseinfoEntity.class,id);
        //System.out.println("dao");
        //System.out.println(fileName);
        System.out.println(tTeacherBaseinfoEntity);
        tTeacherBaseinfoEntity.setPicture(fileName);

        session.update(tTeacherBaseinfoEntity);
        transaction.commit();
    }

    @Override
    public void uploadIdentityFile(String fileName, int id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();

        TTeacherBaseinfoEntity tTeacherBaseinfoEntity = session.load(TTeacherBaseinfoEntity.class,id);
        System.out.println("dao");
        System.out.println(fileName);
        System.out.println(tTeacherBaseinfoEntity);
        tTeacherBaseinfoEntity.setIdentityPic(fileName);

        session.update(tTeacherBaseinfoEntity);
        transaction.commit();
    }

    @Override
    public void uploadDegreeCart(String fileName, int id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();

//        TEducationExperienceEntity tEducationExperienceEntity = session.load(TEducationExperienceEntity.class,id);
        List<TEducationExperienceEntity> tEducationExperienceEntity = session.createCriteria(TEducationExperienceEntity.class).add(Restrictions.eq("id",id)).list();
        if (tEducationExperienceEntity.size() > 0){

            tEducationExperienceEntity.get(0).setDegreeCard(fileName);

            session.update(tEducationExperienceEntity.get(0));
        }
        transaction.commit();
    }
}

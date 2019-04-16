package com.jingguanFiles.abilityProject.dao.impl;

import com.jingguanFiles.abilityProject.dao.AbilityProjectDao;
import com.jingguanFiles.abilityProject.po.TAbilityProjectEntity;
import com.jingguanFiles.common.impl.BaseDao;
import com.jingguanFiles.common.vo.Page;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 陈 on 2017/11/30.
 */
@Repository("abilityProjectDao")
public class AbilityProjectDaoImpl extends BaseDao implements AbilityProjectDao {


    @Override
    public void uploadFile(String fileName, String filename, int id, int user_id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        TAbilityProjectEntity tArticleEntity = session.load(TAbilityProjectEntity.class,id);
        System.out.println(fileName);
        tArticleEntity.setPrizeEvidenceSrc(fileName);
        tArticleEntity.setFileName(filename);
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        tArticleEntity.setUploadTime(ft.format(dNow).toString());
        session.update(tArticleEntity);
        transaction.commit();
    }
}

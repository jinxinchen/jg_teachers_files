package com.jingguanFiles.copyRight.dao.impl;

import com.jingguanFiles.copyRight.dao.CopyRightDao;
import com.jingguanFiles.copyRight.po.TCopyrightEntity;
import com.jingguanFiles.common.impl.BaseDao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 陈 on 2017/11/11.
 */
@Repository("copyRightDao")
    public class CopyRightServiceDaoImpl extends BaseDao implements CopyRightDao {


    @Override
    public void uploadFile(String fileName, String filename, int id, int user_id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("dao");
        TCopyrightEntity tCopyrightEntity = session.load(TCopyrightEntity.class,id);
        System.out.println("sss"+fileName);
        System.out.println("qweqwe::::::"+tCopyrightEntity.getId());
        tCopyrightEntity.setCopyRightSrc(fileName);
        tCopyrightEntity.setFileName(filename);

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        tCopyrightEntity.setUploadTime(ft.format(dNow).toString());

        session.update(tCopyrightEntity);
        transaction.commit();

    }


}

package com.jingguanFiles.project.dao.impl;

import com.jingguanFiles.common.impl.BaseDao;
import com.jingguanFiles.project.dao.ProjectFileDao;
import com.jingguanFiles.project.po.TScientificEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhouliang on 2018/3/15 0015.
 */
@Repository("projectFileDao")
public class ProjectFileDaoImpl extends BaseDao implements ProjectFileDao {
    @Override
    public void update(TScientificEntity record) {
        Session session=getCurrentSession();
        Transaction transaction=session.beginTransaction();

        session.update(record);

        transaction.commit();
    }

    @Override
    public TScientificEntity getRecordById(int id) {
        Session session=getCurrentSession();
        Transaction transaction=session.beginTransaction();

        List<TScientificEntity> list=null;
        TScientificEntity record=null;

        list=session.createCriteria(TScientificEntity.class).add(Restrictions.eq("id",id)).list();
        if(list.size()>0) {
            record = list.get(0);
        }
        transaction.commit();
        return record;
    }
}

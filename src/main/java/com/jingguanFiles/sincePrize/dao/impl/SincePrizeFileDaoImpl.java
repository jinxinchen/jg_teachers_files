package com.jingguanFiles.sincePrize.dao.impl;

import com.jingguanFiles.common.impl.BaseDao;
import com.jingguanFiles.sincePrize.dao.SincePrizeFileDao;
import com.jingguanFiles.sincePrize.po.TEducateScientificEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhouliang on 2018/3/15 0015.
 */
@Repository("sincePrizeFileDao")
public class SincePrizeFileDaoImpl extends BaseDao implements SincePrizeFileDao {
    @Override
    public void update(TEducateScientificEntity record) {
        Session session=getCurrentSession();
        Transaction transaction=session.beginTransaction();
        session.update(record);
        transaction.commit();
    }

    @Override
    public TEducateScientificEntity getRecordById(int id) {
        Session session=getCurrentSession();
        Transaction transaction=session.beginTransaction();

        List<TEducateScientificEntity> list=null;
        TEducateScientificEntity record=null;
        list=session.createCriteria(TEducateScientificEntity.class).add(Restrictions.eq("id",id)).list();
        if(list.size()>0){
            record=list.get(0);
        }


        transaction.commit();
        return record;
    }
}

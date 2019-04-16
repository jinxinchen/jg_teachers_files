package com.jingguanFiles.activity.dao.impl;

import com.jingguanFiles.common.impl.BaseDao;
import com.jingguanFiles.activity.dao.ActivityFileDao;
import com.jingguanFiles.activity.po.ActivityFile;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhouliang on 2018/3/14 0014.
 */
@Repository("activityFileDao")
public class ActivityFileDaoImpl extends BaseDao implements ActivityFileDao{
    @Override
    public void update(ActivityFile record) {
        Session session=getCurrentSession();
        Transaction transaction=session.beginTransaction();
        session.update(record);
        transaction.commit();
    }

    @Override
    public ActivityFile getRecordById(int id) {

        ActivityFile activityFile=null;
        List<ActivityFile> list;
        Session session=getCurrentSession();
        Transaction transaction=session.beginTransaction();
        list=session.createCriteria(ActivityFile.class).add(Restrictions.eq("id",id)).list();
        if(list.size()>0){
            activityFile=list.get(0);
        }
        transaction.commit();
        return activityFile;
    }
}

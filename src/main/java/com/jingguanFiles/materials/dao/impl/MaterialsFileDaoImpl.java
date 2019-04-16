package com.jingguanFiles.materials.dao.impl;

import com.jingguanFiles.common.impl.BaseDao;
import com.jingguanFiles.materials.dao.MaterialsFileDao;
import com.jingguanFiles.materials.po.TTeachingMaterialEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhouliang on 2018/3/15 0015.
 */
@Repository("materialsFileDao")
public class MaterialsFileDaoImpl extends BaseDao implements MaterialsFileDao {
    @Override
    public void update(TTeachingMaterialEntity record) {
        Session session=getCurrentSession();
        Transaction transaction=session.beginTransaction();
        session.update(record);
        transaction.commit();
    }

    @Override
    public TTeachingMaterialEntity getRecordById(int id) {

        List<TTeachingMaterialEntity>list=null;
        TTeachingMaterialEntity record=null;

        Session session=getCurrentSession();
        Transaction transaction=session.beginTransaction();

        list=session.createCriteria(TTeachingMaterialEntity.class).add(Restrictions.eq("id",id)).list();

        if(list.size()>0){
            record=list.get(0);
        }

        transaction.commit();

        return record;
    }
}

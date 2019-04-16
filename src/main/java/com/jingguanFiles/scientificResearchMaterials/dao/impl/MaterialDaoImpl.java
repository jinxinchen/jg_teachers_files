package com.jingguanFiles.scientificResearchMaterials.dao.impl;

import com.jingguanFiles.common.impl.BaseDao;
import com.jingguanFiles.common.vo.Page;
import com.jingguanFiles.scientificResearchMaterials.dao.MaterialDao;
import com.jingguanFiles.scientificResearchMaterials.po.TScientificresearchmaterialsEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 陈 on 2017/12/10.
 */
@Repository("materialDao")
public class MaterialDaoImpl extends BaseDao implements MaterialDao {

    @Override
    public void uploadFile(String fileName, String filename, int id, int user_id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        System.out.println(id);
//        TScientificresearchmaterialsEntity tScientificresearchmaterialsEntity = session.load(TScientificresearchmaterialsEntity.class,id);
        List<TScientificresearchmaterialsEntity> tScientificresearchmaterialsEntity = session.createCriteria(TScientificresearchmaterialsEntity.class).add(Restrictions.eq("id",id)).list();
        System.out.println(tScientificresearchmaterialsEntity.size());
        if(tScientificresearchmaterialsEntity.size()>0){
            tScientificresearchmaterialsEntity.get(0).setFileSrc(fileName);
            tScientificresearchmaterialsEntity.get(0).setFileName(filename);
            Date dNow = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            tScientificresearchmaterialsEntity.get(0).setTime(ft.format(dNow).toString());

            session.update(tScientificresearchmaterialsEntity.get(0));
        }
        transaction.commit();
    }


}

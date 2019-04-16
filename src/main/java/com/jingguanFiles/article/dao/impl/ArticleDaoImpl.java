package com.jingguanFiles.article.dao.impl;

import com.jingguanFiles.article.dao.ArticleDao;
import com.jingguanFiles.article.po.TArticleEntity;
import com.jingguanFiles.common.impl.BaseDao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 陈 on 2017/11/11.
 */
@Repository("articleDao")
public class ArticleDaoImpl extends BaseDao implements ArticleDao {


    @Override
    public void uploadFile(String fileName, String filename, int id, int user_id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();

        TArticleEntity tArticleEntity = session.load(TArticleEntity.class,id);
        System.out.println("sss"+fileName);
        System.out.println("qweqwe::::::"+tArticleEntity.getId());
        tArticleEntity.setArticleSrc(fileName);
        tArticleEntity.setFileName(filename);

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        tArticleEntity.setUploadTime(ft.format(dNow).toString());

        session.update(tArticleEntity);
        transaction.commit();

    }


}

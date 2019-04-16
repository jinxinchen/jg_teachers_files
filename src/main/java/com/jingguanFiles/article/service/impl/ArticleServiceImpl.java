package com.jingguanFiles.article.service.impl;

import com.jingguanFiles.article.dao.ArticleDao;
import com.jingguanFiles.article.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 陈 on 2017/11/11.
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService{

    @Resource(name = "articleDao")
    private ArticleDao articleDao;


    @Override
    public void uploadFile(String fileName,String filename, int id, int user_id) {
        articleDao.uploadFile(fileName,filename,id,user_id);
    }




}

package com.jingguanFiles.abilityProject.service.impl;

import com.jingguanFiles.abilityProject.dao.AbilityProjectDao;
import com.jingguanFiles.abilityProject.po.TAbilityProjectEntity;
import com.jingguanFiles.abilityProject.service.AbilityProjectService;
import com.jingguanFiles.common.vo.Page;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.jingguanFiles.common.impl.BaseDao.getCurrentSession;

/**
 * Created by 陈 on 2017/11/18.
 */
@Service("abilityProjectService")
public class AbilityProjectServiceImpl implements AbilityProjectService {

    @Resource(name = "abilityProjectDao")
    private AbilityProjectDao abilityProjectDao;



    @Override
    public void uploadFile(String fileName, String filename, int id, int user_id) {
        abilityProjectDao.uploadFile(fileName,filename,id,user_id);
    }






}

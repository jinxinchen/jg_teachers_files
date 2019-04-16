package com.jingguanFiles.project.service.impl;

import com.jingguanFiles.common.tool.DeleteTools;
import com.jingguanFiles.project.dao.ProjectFileDao;
import com.jingguanFiles.project.po.TScientificEntity;
import com.jingguanFiles.project.service.ProjectFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhouliang on 2018/3/15 0015.
 */
@Service("projectFileService")
public class ProjectFileServiceImpl implements ProjectFileService {

    @Resource(name = "projectFileDao")
    ProjectFileDao projectFileDao;

    @Override
    public void checkDir(String path) {
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdir();
        }
    }

    @Override
    public TScientificEntity checkCreateFile(int id, String path) {
        TScientificEntity record=getRecord(id);
//        if(record.getCreateScientificEvidenceSrc()!=null){
//            DeleteTools deleteTools=new DeleteTools();
//            deleteTools.setReallyPath(path);
//            deleteTools.deleteFile(record.getCreateScientificEvidenceSrc());
//        }

        return record;
    }

    @Override
    public TScientificEntity checkEndFile(int id, String path) {
        TScientificEntity record=getRecord(id);
//        if(record.getEndScientificEvidenceSrc()!=null){
//            DeleteTools deleteTools=new DeleteTools();
//            deleteTools.setReallyPath(path);
//            deleteTools.deleteFile(record.getEndScientificEvidenceSrc());
//        }

        return record;
    }

    @Override
    public TScientificEntity getRecord(int id) {
        return projectFileDao.getRecordById(id);
    }

    @Override
    public void uploadCreateFile(TScientificEntity record) {
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        record.setCreateUpdateTime(time);
        projectFileDao.update(record);
    }

    @Override
    public void uploadEndFile(TScientificEntity record) {
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        record.setEndUpdateTime(time);
        projectFileDao.update(record);
    }
}

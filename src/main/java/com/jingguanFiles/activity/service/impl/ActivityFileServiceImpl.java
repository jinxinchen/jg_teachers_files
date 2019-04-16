package com.jingguanFiles.activity.service.impl;

import com.jingguanFiles.activity.dao.ActivityFileDao;
import com.jingguanFiles.activity.po.ActivityFile;
import com.jingguanFiles.activity.service.ActivityFileService;
import com.jingguanFiles.tool.DeleteTools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhouliang on 2018/3/14 0014.
 */
@Service("activityFileService")
public class ActivityFileServiceImpl implements ActivityFileService {
    @Resource(name = "activityFileDao")
    ActivityFileDao activityFileDao;

    @Override
    public void checkDir(String path) {

        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdir();
        }

    }

    @Override
    public ActivityFile checkFile(int id,String realypath) {
        ActivityFile record=getRecord(id);

        if(record.getCertificate()!=null){
            DeleteTools deleteTools=new DeleteTools();
            deleteTools.setReallyPath(realypath);
            deleteTools.deleteFile(record.getCertificate());
        }

        return record;
    }

    @Override
    public ActivityFile getRecord(int id) {
        return activityFileDao.getRecordById(id);
    }

    @Override
    public void uploadFile(ActivityFile record) {
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        record.setCertificateUploadTime(time);
        activityFileDao.update(record);
    }
}

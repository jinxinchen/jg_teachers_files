package com.jingguanFiles.sincePrize.service.impl;

import com.jingguanFiles.sincePrize.dao.SincePrizeFileDao;
import com.jingguanFiles.sincePrize.po.TEducateScientificEntity;
import com.jingguanFiles.sincePrize.service.SincePrizeFileService;
import com.jingguanFiles.tool.DeleteTools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhouliang on 2018/3/15 0015.
 */
@Service("sincePrizeFileService")
public class SincePrizeFileServiceImpl implements SincePrizeFileService {

    @Resource(name = "sincePrizeFileDao")
    SincePrizeFileDao sincePrizeFileDao;

    @Override
    public void checkDir(String path) {
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdir();
        }
    }

    @Override
    public TEducateScientificEntity checkFile(int id, String path) {
        TEducateScientificEntity record=getRecord(id);
        if(record.getEvidencePath()!=null){
            DeleteTools deleteTools=new DeleteTools();
            deleteTools.setReallyPath(path);
            deleteTools.deleteFile(record.getEvidencePath());
        }

        return record;
    }

    @Override
    public TEducateScientificEntity getRecord(int id) {
        return sincePrizeFileDao.getRecordById(id);
    }

    @Override
    public void uploadFile(TEducateScientificEntity record) {
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        record.setUploadTime(time);
        sincePrizeFileDao.update(record);
    }
}

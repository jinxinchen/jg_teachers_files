package com.jingguanFiles.materials.service.impl;

import com.jingguanFiles.materials.dao.MaterialsFileDao;
import com.jingguanFiles.materials.po.TTeachingMaterialEntity;
import com.jingguanFiles.materials.service.MaterialsFileService;
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
@Service("materialsFileService")
public class MaterialsFileServiceImpl implements MaterialsFileService {

    @Resource(name="materialsFileDao")
    MaterialsFileDao materialsFileDao;

    @Override
    public void checkDir(String path) {
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdir();
        }

    }

    @Override
    public TTeachingMaterialEntity checkFile(int id, String path) {

        TTeachingMaterialEntity record=getRecord(id);
        if(record.getFile()!=null){
            DeleteTools deleteTools=new DeleteTools();
            deleteTools.setReallyPath(path);
            deleteTools.deleteFile(record.getFile());
        }

        return record;
    }

    @Override
    public TTeachingMaterialEntity getRecord(int id) {
        return materialsFileDao.getRecordById(id);
    }

    @Override
    public void uploadFile(TTeachingMaterialEntity record) {
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        record.setFileTime(time);
        materialsFileDao.update(record);
    }
}

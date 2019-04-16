package com.jingguanFiles.common.tool;

import java.io.File;

/**
 * Created by zhouliang on 2018/2/12 0012.
 */
public class  DeleteTools {
     String rex;
     String reallyPath;

    public void setRex(String rex) {
        this.rex = rex;
    }

    public void setReallyPath(String reallyPath) {
        this.reallyPath = reallyPath;
    }

    public boolean  deleteFile(String path){
        if(path==null){
            return false;
        }
        path=path.replace(rex,"");
        String uploadUrl = reallyPath + path + "/";
        boolean result=false;
        File deleteFile=new File(uploadUrl);

        if(deleteFile.exists()){
            System.out.println("delete "+uploadUrl);
            deleteFile.delete();
            result=true;
        }else {
            System.out.println("delete fail");
        }
        return  result;

    }
}

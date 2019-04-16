package com.jingguanFiles.tool;

import java.io.File;

/**
 * Created by zhouliang on 2018/2/12 0012.
 */
public class DeleteTools {
     private static  String rex="http://192.168.213.253:8099/teachers_files/";
     private String reallyPath;

    public static void setRex(String newRex) {
        rex = newRex;
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
            result=deleteFile.delete();
        }else {
            System.out.println("delete fail :"+path);
        }
        return  result;

    }
}

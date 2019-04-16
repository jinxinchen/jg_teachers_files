package com.jingguanFiles.abilityProject.dao;

import com.jingguanFiles.abilityProject.po.TAbilityProjectEntity;
import com.jingguanFiles.common.vo.Page;

/**
 * Created by 陈 on 2017/11/18.
 */
public interface AbilityProjectDao {
    void uploadFile(String fileName, String filename, int id, int user_id);
}

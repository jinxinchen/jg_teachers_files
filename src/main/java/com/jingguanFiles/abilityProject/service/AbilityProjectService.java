package com.jingguanFiles.abilityProject.service;

import com.jingguanFiles.abilityProject.po.TAbilityProjectEntity;
import com.jingguanFiles.common.vo.Page;

import java.util.List;

/**
 * Created by 陈 on 2017/11/18.
 */
public interface AbilityProjectService {
    void uploadFile(String fileName, String filename, int id, int user_id);
}

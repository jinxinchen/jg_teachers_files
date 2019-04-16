package com.jingguanFiles.sincePrize.dao;

import com.jingguanFiles.sincePrize.po.TEducateScientificEntity;

/**
 * Created by zhouliang on 2018/3/14 0014.
 */
public interface SincePrizeFileDao {

    void update(TEducateScientificEntity record);
    TEducateScientificEntity getRecordById(int id);

}

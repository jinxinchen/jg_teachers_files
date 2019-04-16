package com.jingguanFiles.sincePrize.po;

import javax.persistence.*;

/**
 * Created by zhouliang on 2018/3/15 0015.
 */
@Entity
@Table(name = "t_educate_scientific", schema = "jg_teachers", catalog = "")
public class TEducateScientificEntity {
    private int id;
    private String evidencePath;
    private String uploadTime;
    private String fileName;
    private int userId;

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "evidence_path")
    public String getEvidencePath() {
        return evidencePath;
    }

    public void setEvidencePath(String evidencePath) {
        this.evidencePath = evidencePath;
    }

    @Basic
    @Column(name = "upload_time")
    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    @Basic
    @Column(name = "file_name")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TEducateScientificEntity that = (TEducateScientificEntity) o;

        if (id != that.id) return false;
        if (evidencePath != null ? !evidencePath.equals(that.evidencePath) : that.evidencePath != null) return false;
        if (uploadTime != null ? !uploadTime.equals(that.uploadTime) : that.uploadTime != null) return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (evidencePath != null ? evidencePath.hashCode() : 0);
        result = 31 * result + (uploadTime != null ? uploadTime.hashCode() : 0);
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        return result;
    }
}

package com.jingguanFiles.materials.po;

import javax.persistence.*;

/**
 * Created by zhouliang on 2018/3/14 0014.
 */
@Entity
@Table(name = "t_teaching_material", schema = "jg_teachers", catalog = "")
public class TTeachingMaterialEntity {
    private int id;
    private String file;
    private String fileTime;
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
    @Column(name = "file")
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Basic
    @Column(name = "file_time")
    public String getFileTime() {
        return fileTime;
    }

    public void setFileTime(String fileTime) {
        this.fileTime = fileTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTeachingMaterialEntity that = (TTeachingMaterialEntity) o;

        if (id != that.id) return false;
        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (fileTime != null ? !fileTime.equals(that.fileTime) : that.fileTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (file != null ? file.hashCode() : 0);
        result = 31 * result + (fileTime != null ? fileTime.hashCode() : 0);
        return result;
    }
}

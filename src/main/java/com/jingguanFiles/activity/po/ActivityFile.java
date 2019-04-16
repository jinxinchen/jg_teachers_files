package com.jingguanFiles.activity.po;

import javax.persistence.*;

/**
 * Created by zhouliang on 2018/3/14 0014.
 */
@Entity
@Table(name = "t_teacher_activity", schema = "jg_teachers", catalog = "")
public class ActivityFile {

    private int id;
    private String certificateUploadTime;
    private String certificate;
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
    @Column(name = "certificate_upload_time")
    public String getCertificateUploadTime() {
        return certificateUploadTime;
    }

    public void setCertificateUploadTime(String certificateUploadTime) {
        this.certificateUploadTime = certificateUploadTime;
    }

    @Basic
    @Column(name = "certificate")
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActivityFile that = (ActivityFile) o;

        if (id != that.id) return false;
        if (certificateUploadTime != null ? !certificateUploadTime.equals(that.certificateUploadTime) : that.certificateUploadTime != null)
            return false;
        if (certificate != null ? !certificate.equals(that.certificate) : that.certificate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (certificateUploadTime != null ? certificateUploadTime.hashCode() : 0);
        result = 31 * result + (certificate != null ? certificate.hashCode() : 0);
        return result;
    }
}

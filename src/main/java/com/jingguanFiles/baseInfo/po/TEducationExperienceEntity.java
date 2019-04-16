package com.jingguanFiles.baseInfo.po;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_education_experience", schema = "jg_teachers", catalog = "")
public class TEducationExperienceEntity {
    private int id;
    private String school;
    private String major;
    private String abroad;
    private String education;
    private String entrance;
    private String graduationYear;
    private String graduateCard;
    private String degreeCard;
    private Integer status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "school")
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Basic
    @Column(name = "major")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "abroad")
    public String getAbroad() {
        return abroad;
    }

    public void setAbroad(String abroad) {
        this.abroad = abroad;
    }

    @Basic
    @Column(name = "education")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "entrance")
    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    @Basic
    @Column(name = "graduationYear")
    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    @Basic
    @Column(name = "graduate_card")
    public String getGraduateCard() {
        return graduateCard;
    }

    public void setGraduateCard(String graduateCard) {
        this.graduateCard = graduateCard;
    }

    @Basic
    @Column(name = "degree_card")
    public String getDegreeCard() {
        return degreeCard;
    }

    public void setDegreeCard(String degreeCard) {
        this.degreeCard = degreeCard;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TEducationExperienceEntity that = (TEducationExperienceEntity) o;
        return id == that.id &&
                Objects.equals(school, that.school) &&
                Objects.equals(major, that.major) &&
                Objects.equals(abroad, that.abroad) &&
                Objects.equals(education, that.education) &&
                Objects.equals(entrance, that.entrance) &&
                Objects.equals(graduationYear, that.graduationYear) &&
                Objects.equals(graduateCard, that.graduateCard) &&
                Objects.equals(degreeCard, that.degreeCard) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, school, major, abroad, education, entrance, graduationYear, graduateCard, degreeCard, status);
    }
}

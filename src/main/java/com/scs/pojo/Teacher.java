package com.scs.pojo;

import java.util.Date;

/*
      <arg column="id" javaType="java.lang.Integer" jdbcType="INTEGER" />
      <arg column="user_id" javaType="java.lang.Integer" jdbcType="INTEGER" />
      <arg column="name" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="sex" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="birth" javaType="java.util.Date" jdbcType="TIMESTAMP" />
      <arg column="employment_date" javaType="java.util.Date" jdbcType="TIMESTAMP" />
      <arg column="home" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="introduction" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="job_title" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="pic" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="create_time" javaType="java.util.Date" jdbcType="TIMESTAMP" />
      <arg column="update_time" javaType="java.util.Date" jdbcType="TIMESTAMP" />
      <arg column="disabled" javaType="java.lang.Boolean" jdbcType="BIT" />
*/
public class Teacher {
    private Integer id;
    private Integer userId;
    private String name;
    private String sex;
    private Date birth;
    private Date employmentDate;
    private String home;
    private String introduction;
    private String jobTitle;
    private String pic;
    private Date createTime;
    private Date updateTime;
    private Boolean disabled;

    public Teacher(Integer userId, String name, String sex, Date birth, Date employmentDate, String home, String introduction, String jobTitle, String pic,  Boolean disabled) {

        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.employmentDate = employmentDate;
        this.home = home;
        this.introduction = introduction;
        this.jobTitle = jobTitle;
        this.pic = pic;
        this.disabled = disabled;
    }

    public Teacher() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home == null ? null : home.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle == null ? null : jobTitle.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                ", employmentDate=" + employmentDate +
                ", home='" + home + '\'' +
                ", introduction='" + introduction + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", pic='" + pic + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", disabled=" + disabled +
                '}';
    }
}
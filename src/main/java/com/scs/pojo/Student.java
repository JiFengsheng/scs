package com.scs.pojo;


import java.util.Date;

/*
      <arg column="id" javaType="java.lang.Integer" jdbcType="INTEGER" />
      <arg column="user_id" javaType="java.lang.Integer" jdbcType="INTEGER" />
      <arg column="student_id" javaType="java.lang.Integer" jdbcType="INTEGER" />
      <arg column="name" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="sex" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="birth" javaType="java.util.Date" jdbcType="TIMESTAMP" />
      <arg column="Admission_Date" javaType="java.util.Date" jdbcType="TIMESTAMP" />
      <arg column="native_place" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="home" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="email_code" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="academy" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="class_id" javaType="java.lang.Integer" jdbcType="INTEGER" />
      <arg column="pic" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="create_time" javaType="java.util.Date" jdbcType="TIMESTAMP" />
      <arg column="update_time" javaType="java.util.Date" jdbcType="TIMESTAMP" />
      <arg column="disabled" javaType="java.lang.Boolean" jdbcType="BIT" />*/
public class Student {
    private Integer id;
    private  Integer userId;
    private Integer studentId;
    private String name;
    private String sex;
    private Date birth;
    private Date admissionDate;
    private String nativePlace;
    private String home;
    private String emailCode;
    private String academy;
    private Integer classId;
    private String pic;
    private Date createTime;
    private Date updateTime;
    private Boolean disabled;


    public Student() {
        super();
    }

    public Student(Integer userId, Integer studentId, String name, String sex, Date birth, Date admissionDate, String nativePlace, String home, String emailCode, String academy, Integer classId, String pic, Boolean disabled) {
        this.userId = userId;
        this.studentId = studentId;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.admissionDate = admissionDate;
        this.nativePlace = nativePlace;
        this.home = home;
        this.emailCode = emailCode;
        this.academy = academy;
        this.classId = classId;
        this.pic = pic;
        this.disabled = disabled;
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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getEmailCode() {
        return emailCode;
    }

    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
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
        return "Student{" +
                "id=" + id +
                ", userId=" + userId +
                ", studentId=" + studentId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                ", admissionDate=" + admissionDate +
                ", nativePlace='" + nativePlace + '\'' +
                ", home='" + home + '\'' +
                ", emailCode='" + emailCode + '\'' +
                ", academy='" + academy + '\'' +
                ", classId=" + classId +
                ", pic='" + pic + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", disabled=" + disabled +
                '}';
    }
}
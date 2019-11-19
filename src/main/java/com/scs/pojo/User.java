package com.scs.pojo;

import java.util.Date;

public class User {
    /*<arg column="id" javaType="java.lang.Integer" jdbcType="INTEGER" />
      <arg column="name" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="password" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="rfid" javaType="java.lang.String" jdbcType="VARCHAR" />
      <arg column="role" javaType="java.lang.Integer" jdbcType="INTEGER" />
      <arg column="create_time" javaType="java.util.Date" jdbcType="TIMESTAMP" />
      <arg column="update_time" javaType="java.util.Date" jdbcType="TIMESTAMP" />
      <arg column="disabled" javaType="java.lang.Boolean" jdbcType="BIT" />
      */
    private Integer id;
    private String name;
    private String password;
    private String rfid;
    private Integer role;
    private Date createTime;
    private Date updateTime;
    private boolean disabled;

    public User() {
        super();
    }

    public User(String name, String password, String rfid, Integer role, boolean disabled) {
        this.name = name;
        this.password = password;
        this.rfid = rfid;
        this.role = role;
        this.disabled = disabled;
    }

    public User(String name, String password, String rfid, Integer role, Date createTime, Date updateTime, boolean disabled) {
        this.name = name;
        this.password = password;
        this.rfid = rfid;
        this.role = role;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.disabled = disabled;
    }

    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }



    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", rfid='" + rfid + '\'' +
                ", role=" + role +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", disabled=" + disabled +
                '}';
    }
}
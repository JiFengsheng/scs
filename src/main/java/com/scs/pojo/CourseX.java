package com.scs.pojo;

import java.util.Date;

public class CourseX {
    private Integer id;

    private Integer teacherId;

    private String name;

    private Integer credit;

    private Date startTime;

    private Date endTime;

    private Boolean disabled;

    public CourseX( Integer teacherId, String name, Integer credit, Date startTime, Date endTime, Boolean disabled) {

        this.teacherId = teacherId;
        this.name = name;
        this.credit = credit;
        this.startTime = startTime;
        this.endTime = endTime;
        this.disabled = disabled;
    }

    public CourseX() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "CourseX{" +
                "id=" + id +
                ", teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", disabled=" + disabled +
                '}';
    }
}
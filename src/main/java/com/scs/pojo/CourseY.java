package com.scs.pojo;

import java.util.Date;

public class CourseY {
    private Integer id;
    private Integer courseId;
    private String weekDay;
    private Integer time;
    private Boolean disabled;

    public CourseY( Integer courseId, String weekDay, Integer time, Boolean disabled) {

        this.courseId = courseId;
        this.weekDay = weekDay;
        this.time = time;
        this.disabled = disabled;
    }

    public CourseY() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay == null ? null : weekDay.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "CourseY{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", weekDay='" + weekDay + '\'' +
                ", time=" + time +
                ", disabled=" + disabled +
                '}';
    }
}
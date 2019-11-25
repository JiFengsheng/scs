package com.scs.pojo;

import java.util.Date;

public class Sign {
    private Integer id;

    private Date date;

    private Integer courseyId;

    private Integer studentId;

    private Date signTime;

    private Integer classId;

    private Date leaveTime;

    public Sign( Date date, Integer courseyId, Integer studentId, Date signTime, Integer classId, Date leaveTime) {

        this.date = date;
        this.courseyId = courseyId;
        this.studentId = studentId;
        this.signTime = signTime;
        this.classId = classId;
        this.leaveTime = leaveTime;
    }

    public Sign() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCourseyId() {
        return courseyId;
    }

    public void setCourseyId(Integer courseyId) {
        this.courseyId = courseyId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    @Override
    public String toString() {
        return "Sign{" +
                "id=" + id +
                ", date=" + date +
                ", courseyId=" + courseyId +
                ", studentId=" + studentId +
                ", signTime=" + signTime +
                ", classId=" + classId +
                ", leaveTime=" + leaveTime +
                '}';
    }
}
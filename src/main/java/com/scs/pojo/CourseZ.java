package com.scs.pojo;

public class CourseZ {
    private Integer id;
    private String time;
    private String startTime;
    private String endTime;
    public CourseZ(Integer id, String time, String startTime, String endTime) {
        this.id = id;
        this.time = time;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public CourseZ() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    @Override
    public String toString() {
        return "CourseZ{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
package com.scs.pojo;

import java.util.Date;

public class Equipment {
    private Integer id;

    private String name;

    private Date inputTime;

    private String lei;

    private String state;

    public Equipment(String name, Date inputTime, String lei, String state) {

        this.name = name;
        this.inputTime = inputTime;
        this.lei = lei;
        this.state = state;
    }

    public Equipment() {
        super();
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
        this.name = name == null ? null : name.trim();
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getLei() {
        return lei;
    }

    public void setLei(String lei) {
        this.lei = lei == null ? null : lei.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", inputTime=" + inputTime +
                ", lei='" + lei + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
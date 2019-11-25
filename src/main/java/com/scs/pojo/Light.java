package com.scs.pojo;

import java.util.Date;

public class Light {
    private Integer id;

    private Float bright;

    private Boolean onOff;

    private Date time;

    private Integer equipmentId;

    public Light(Integer id, Float bright, Boolean onOff, Date time, Integer equipmentId) {
        this.id = id;
        this.bright = bright;
        this.onOff = onOff;
        this.time = time;
        this.equipmentId = equipmentId;
    }

    public Light() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getBright() {
        return bright;
    }

    public void setBright(Float bright) {
        this.bright = bright;
    }

    public Boolean getOnOff() {
        return onOff;
    }

    public void setOnOff(Boolean onOff) {
        this.onOff = onOff;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }
}
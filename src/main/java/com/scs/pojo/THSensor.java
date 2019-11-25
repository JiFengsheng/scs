package com.scs.pojo;

import java.util.Date;

public class THSensor {
    private Integer id;

    private Date time;

    private Integer equipmentId;

    private Float temperature;

    private Float humidity;

    private Boolean sign;

    public THSensor( Date time, Integer equipmentId, Float temperature, Float humidity, Boolean sign) {

        this.time = time;
        this.equipmentId = equipmentId;
        this.temperature = temperature;
        this.humidity = humidity;
        this.sign = sign;
    }

    public THSensor() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Boolean getSign() {
        return sign;
    }

    public void setSign(Boolean sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "THSensor{" +
                "id=" + id +
                ", time=" + time +
                ", equipmentId=" + equipmentId +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", sign=" + sign +
                '}';
    }


}
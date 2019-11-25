package com.scs.pojo;

import java.util.Date;

public class Aircondition {
    private Integer id;

    private Float temperature;

    private String windSpeed;

    private String windDirection;

    private String model;

    private Date time;

    private Integer equipmentId;

    public Aircondition(Float temperature, String windSpeed, String windDirection, String model, Date time, Integer equipmentId) {

        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.model = model;
        this.time = time;
        this.equipmentId = equipmentId;
    }

    public Aircondition() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed == null ? null : windSpeed.trim();
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection == null ? null : windDirection.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
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

    @Override
    public String toString() {
        return "Aircondition{" +
                "id=" + id +
                ", temperature=" + temperature +
                ", windSpeed='" + windSpeed + '\'' +
                ", windDirection='" + windDirection + '\'' +
                ", model='" + model + '\'' +
                ", time=" + time +
                ", equipmentId=" + equipmentId +
                '}';
    }
}
package com.scs.pojo;

import java.util.Date;

public class Control {
    private Integer id;

    private Date time;

    private Integer userId;

    private String order;

    private Integer equipmentId;

    public Control( Date time, Integer userId, String order, Integer equipmentId) {

        this.time = time;
        this.userId = userId;
        this.order = order;
        this.equipmentId = equipmentId;
    }

    public Control() {
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order == null ? null : order.trim();
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    @Override
    public String toString() {
        return "Control{" +
                "id=" + id +
                ", time=" + time +
                ", userId=" + userId +
                ", order='" + order + '\'' +
                ", equipmentId=" + equipmentId +
                '}';
    }
}
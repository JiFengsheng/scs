package com.scs.pojo;

public class Addr {
    private Integer id;

    private String classroom;

    private String num;

    private Integer equipmentId;

    public Addr(String classroom, String num, Integer equipmentId) {

        this.classroom = classroom;
        this.num = num;
        this.equipmentId = equipmentId;
    }

    public Addr() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom == null ? null : classroom.trim();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    @Override
    public String toString() {
        return "Addr{" +
                "id=" + id +
                ", classroom='" + classroom + '\'' +
                ", num='" + num + '\'' +
                ", equipmentId=" + equipmentId +
                '}';
    }


}
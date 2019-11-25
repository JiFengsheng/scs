package com.scs.pojo;



public class ClassSCS {
    private Integer id;
    private String academy;
    private String name;
    private String major;
    private String grade;
    private Integer headTeacherId;

    public ClassSCS() {
        super();
    }

    public ClassSCS(String academy, String name, String major, String grade, Integer headTeacherId) {
        this.academy = academy;
        this.name = name;
        this.major = major;
        this.grade = grade;
        this.headTeacherId = headTeacherId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getHeadTeacherId() {
        return headTeacherId;
    }

    public void setHeadTeacherId(Integer headTeacherId) {
        this.headTeacherId = headTeacherId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "ClassSCS{" +
                "id=" + id +
                ", academy='" + academy + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", headTeacherId=" + headTeacherId +
                '}';
    }
}
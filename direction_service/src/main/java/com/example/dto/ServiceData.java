package com.example.dto;

public class ServiceData {
    private String direction;
    private String state;
    private String center;
    private String rollNumber;
    private Double marks;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }
}

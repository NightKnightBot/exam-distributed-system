package com.example.Center1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENT_MARKS")
public class Center {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID")
    int id;

    @Column(name = "ROLL_NUMBER")
    String rollno;

    @Column(name = "AVERAGE_MARKS")
    double marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
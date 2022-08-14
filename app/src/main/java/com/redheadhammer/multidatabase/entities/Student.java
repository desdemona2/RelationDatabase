package com.redheadhammer.multidatabase.entities;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Student {

    @PrimaryKey(autoGenerate = false)
    private final String studentName;
    private final String semester;
    private final String schoolName;

    public Student(String studentName, String semester, String schoolName) {
        this.studentName = studentName;
        this.semester = semester;
        this.schoolName = schoolName;
    }
}

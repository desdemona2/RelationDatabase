package com.redheadhammer.multidatabase.entities;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Student {

    @PrimaryKey(autoGenerate = false)
    @NonNull public String studentName;
    public String semester;
    public String schoolName;

    public Student(@NonNull String studentName, String semester, String schoolName) {
        this.studentName = studentName;
        this.semester = semester;
        this.schoolName = schoolName;
    }
}

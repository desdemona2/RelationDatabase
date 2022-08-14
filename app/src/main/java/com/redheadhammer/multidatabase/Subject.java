package com.redheadhammer.multidatabase;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Subject {

    @PrimaryKey
    private final String subjectName;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }
}

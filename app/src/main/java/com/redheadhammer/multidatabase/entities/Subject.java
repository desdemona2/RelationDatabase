package com.redheadhammer.multidatabase.entities;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Subject {
    @PrimaryKey
    @NonNull public String subjectName;

    public Subject(@NonNull String subjectName) {
        this.subjectName = subjectName;
    }
}

package com.redheadhammer.multidatabase.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class School {

    @PrimaryKey(autoGenerate = false)
    private final String schoolName;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }
}

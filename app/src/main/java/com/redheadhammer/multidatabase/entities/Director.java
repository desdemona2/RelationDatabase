package com.redheadhammer.multidatabase.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Director {

    @PrimaryKey(autoGenerate = false)
    private final String directorName;
    private final String schoolName;

    public Director(String directorName, String schoolName) {
        this.directorName = directorName;
        this.schoolName = schoolName;
    }
}

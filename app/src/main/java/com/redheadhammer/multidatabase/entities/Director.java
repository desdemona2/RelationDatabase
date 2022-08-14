package com.redheadhammer.multidatabase.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Director {

    @PrimaryKey(autoGenerate = false)
    @NonNull public String directorName;
    public String schoolName;

    public Director(@NonNull String directorName, String schoolName) {
        this.directorName = directorName;
        this.schoolName = schoolName;
    }
}

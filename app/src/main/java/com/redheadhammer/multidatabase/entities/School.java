package com.redheadhammer.multidatabase.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class School {

    @PrimaryKey(autoGenerate = false)
    @NonNull public String schoolName;

    public School(@NonNull String schoolName) {
        this.schoolName = schoolName;
    }
}

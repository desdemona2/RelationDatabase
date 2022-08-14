package com.redheadhammer.multidatabase.entities.relations;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(primaryKeys = {"studentName", "subjectName"})
public class StudentSubjectCrossRef {

    @NonNull public String studentName;

    @ColumnInfo(index = true)
    @NonNull public String subjectName;

    public StudentSubjectCrossRef(@NonNull String studentName, @NonNull String subjectName) {
        this.studentName = studentName;
        this.subjectName = subjectName;
    }
}

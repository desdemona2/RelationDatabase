package com.redheadhammer.multidatabase.entities.relations;

import androidx.room.Entity;

@Entity(primaryKeys = {"studentName", "subjectName"})
public class StudentSubjectCrossRef {

    private final String studentName;
    private final String subjectName;

    public StudentSubjectCrossRef(String studentName, String subjectName) {
        this.studentName = studentName;
        this.subjectName = subjectName;
    }
}

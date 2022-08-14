package com.redheadhammer.multidatabase.entities.relations;


import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.redheadhammer.multidatabase.Subject;
import com.redheadhammer.multidatabase.entities.Student;

import java.util.List;

public class SubjectWithStudents {

    @Embedded
    public Subject subject;

    @Relation(
            parentColumn = "subjectName",
            entityColumn = "studentName",
            associateBy = @Junction(StudentSubjectCrossRef.class)
    )
    public List<Student> students;

}

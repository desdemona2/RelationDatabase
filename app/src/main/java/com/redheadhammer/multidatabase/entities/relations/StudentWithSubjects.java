package com.redheadhammer.multidatabase.entities.relations;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.redheadhammer.multidatabase.Subject;
import com.redheadhammer.multidatabase.entities.Student;

import java.util.List;

public class StudentWithSubjects {

    @Embedded
    public Student student;

    @Relation(
            parentColumn = "studentName",
            entityColumn = "subjectName",
            associateBy = @Junction(StudentSubjectCrossRef.class)
    )
    public List<Subject> subjects;
}

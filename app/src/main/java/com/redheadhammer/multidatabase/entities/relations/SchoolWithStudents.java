package com.redheadhammer.multidatabase.entities.relations;


import androidx.room.Embedded;
import androidx.room.Relation;

import com.redheadhammer.multidatabase.entities.School;
import com.redheadhammer.multidatabase.entities.Student;

import java.util.List;


/**
 * One to N relationShip.
 * Convention to name as <ParentTable>With<ChildTable>
 * As now we have N  students associated with a single
 * school we need to specify entityColumn as List of
 * entity Columns.
 */
public class SchoolWithStudents {

    @Embedded
    private final School schoolName;

    @Relation(
            parentColumn = "schoolName",
            entityColumn = "schoolName"
    )
    private final List<Student> studentName;

    public SchoolWithStudents(School schoolName, List<Student> studentName) {
        this.schoolName = schoolName;
        this.studentName = studentName;
    }
}

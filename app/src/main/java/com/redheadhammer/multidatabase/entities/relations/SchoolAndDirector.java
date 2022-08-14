package com.redheadhammer.multidatabase.entities.relations;


import androidx.room.Embedded;
import androidx.room.Relation;

import com.redheadhammer.multidatabase.entities.Director;
import com.redheadhammer.multidatabase.entities.School;

/**
 * ONE TO ONE RELATION:
 * For one to one relationship get instance of both tables
 * parent entity should be annotated with @Embedded and
 * child entity should be annotated with @Relation and
 * relational key should be defined inside as parentColumn
 * and entityColumn.
 */
public class SchoolAndDirector {

    // parent of the Relation
    @Embedded
    final School school;

    @Relation(
            // relational key in both tables (common key)
            parentColumn = "schoolName",
            entityColumn = "schoolName"
    )
    final Director director;

    public SchoolAndDirector(School school, Director director) {
        this.school = school;
        this.director = director;
    }
}

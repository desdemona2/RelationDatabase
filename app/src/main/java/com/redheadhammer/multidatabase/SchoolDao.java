package com.redheadhammer.multidatabase;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;

import com.redheadhammer.multidatabase.entities.Director;
import com.redheadhammer.multidatabase.entities.School;
import com.redheadhammer.multidatabase.entities.Student;
import com.redheadhammer.multidatabase.entities.relations.SchoolAndDirector;
import com.redheadhammer.multidatabase.entities.relations.SchoolWithStudents;

import java.util.List;

@Dao
public interface SchoolDao {

    /**
     * If there is already a school present in the
     * database with passed name than it will replace
     * it with the new value, we can also set it to
     * abort with OnConflictStrategy.ABORT
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertSchool(School school);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertDirector(Director director);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertStudent(Student student);



    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    List<SchoolWithStudents> getSchoolWithStudents(String schoolName);


    /**
     * Transaction annotation make below function ThreadSafe
     */
    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    List<SchoolAndDirector> getSchoolAndDirectorName(String schoolName);
}

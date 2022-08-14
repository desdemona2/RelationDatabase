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
import com.redheadhammer.multidatabase.entities.relations.StudentSubjectCrossRef;
import com.redheadhammer.multidatabase.entities.relations.StudentWithSubjects;
import com.redheadhammer.multidatabase.entities.relations.SubjectWithStudents;

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


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertSubject(Subject subject);


    // Insert for Cross Reference Class.
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertStudentSubjectCrossRef(StudentSubjectCrossRef crossRef);




    // getStudentsOfSubject -> N to M relation
    @Transaction
    @Query("SELECT * FROM student WHERE studentName = :studentName")
    List<StudentWithSubjects> getSubjectsOfStudent(String studentName);


    @Transaction
    @Query("SELECT * FROM subject WHERE subjectName = :subjectName ")
    List<SubjectWithStudents> getStudentsOfSubject(String subjectName);



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

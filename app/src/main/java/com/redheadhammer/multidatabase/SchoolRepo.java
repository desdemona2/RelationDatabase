package com.redheadhammer.multidatabase;


import android.app.Application;

import com.redheadhammer.multidatabase.entities.Director;
import com.redheadhammer.multidatabase.entities.School;
import com.redheadhammer.multidatabase.entities.Student;
import com.redheadhammer.multidatabase.entities.relations.StudentSubjectCrossRef;
import com.redheadhammer.multidatabase.entities.relations.StudentWithSubjects;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SchoolRepo {

    public SchoolDao schoolDao;

    ExecutorService executor = Executors.newSingleThreadExecutor();

    public SchoolRepo (Application application) {
        SchoolDatabase database = SchoolDatabase.getInstance(application);
        schoolDao = database.schoolDao();
    }

    public void insertSchool(School school) {
        executor.execute(() -> schoolDao.insertSchool(school));
    }

    public void insertSubject(Subject subject) {
        executor.execute(() -> schoolDao.insertSubject(subject));
    }


    public void insertStudent(Student student) {
        executor.execute(() -> schoolDao.insertStudent(student));
    }


    public void insertDirector(Director director) {
        executor.execute(() -> schoolDao.insertDirector(director));
    }

    public void insertStudentSubjectCroRef(StudentSubjectCrossRef crossRef) {
        executor.execute(() -> schoolDao.insertStudentSubjectCrossRef(crossRef));
    }

    public List<StudentWithSubjects> getSubjectsOfStudent(String subjectName) {
        return schoolDao.getSubjectsOfStudent(subjectName);
    }
}

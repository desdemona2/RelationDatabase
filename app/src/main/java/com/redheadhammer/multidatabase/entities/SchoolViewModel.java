package com.redheadhammer.multidatabase.entities;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.redheadhammer.multidatabase.SchoolDao;
import com.redheadhammer.multidatabase.SchoolRepo;
import com.redheadhammer.multidatabase.Subject;
import com.redheadhammer.multidatabase.entities.relations.StudentSubjectCrossRef;
import com.redheadhammer.multidatabase.entities.relations.StudentWithSubjects;

import java.util.List;

public class SchoolViewModel extends AndroidViewModel {

    public SchoolRepo schoolRepo;

    public SchoolViewModel(@NonNull Application application) {
        super(application);

        schoolRepo = new SchoolRepo(application);
    }

    public void insertSchool(School school) {
        schoolRepo.insertSchool(school);
    }

    public void insertSubject(Subject subject) {
        schoolRepo.insertSubject(subject);
    }


    public void insertStudent(Student student) {
        schoolRepo.insertStudent(student);
    }


    public void insertDirector(Director director) {
        schoolRepo.insertDirector(director);
    }

    public void insertStudentSubjectCroRef(StudentSubjectCrossRef crossRef) {
        schoolRepo.insertStudentSubjectCroRef(crossRef);
    }

    public List<StudentWithSubjects> getSubjectsOfStudent(String subjectName) {
        return schoolRepo.getSubjectsOfStudent(subjectName);
    }
}

package com.redheadhammer.multidatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.redheadhammer.multidatabase.entities.Student;

public class MainActivity extends AppCompatActivity {


    SchoolDao schoolDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schoolDao = SchoolDatabase.getInstance(getApplication()).schoolDao();
        schoolDao.insertStudent(new Student("Rahul", "2nd", "JNV"));
    }
}
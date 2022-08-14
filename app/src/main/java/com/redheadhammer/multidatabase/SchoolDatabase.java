package com.redheadhammer.multidatabase;


import android.app.Application;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.redheadhammer.multidatabase.entities.Director;
import com.redheadhammer.multidatabase.entities.School;
import com.redheadhammer.multidatabase.entities.Student;
import com.redheadhammer.multidatabase.entities.relations.StudentSubjectCrossRef;


@Database(entities = {
        Director.class,
        School.class,
        Student.class,
        Subject.class,
        StudentSubjectCrossRef.class
}, version = 1, exportSchema = false)
public abstract class SchoolDatabase extends RoomDatabase {

    private static SchoolDatabase instance;

    public abstract SchoolDao schoolDao();

    public static synchronized SchoolDatabase getInstance(Application application) {

        if (instance == null) {
            instance = Room.databaseBuilder(application.getApplicationContext()
                            , SchoolDatabase.class
                            , "school_database"
                    )
                    .allowMainThreadQueries()
                    .build();
        }

        return instance;
    }
}

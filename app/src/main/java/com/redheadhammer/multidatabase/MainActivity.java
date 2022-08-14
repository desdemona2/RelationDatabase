package com.redheadhammer.multidatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.redheadhammer.multidatabase.entities.School;
import com.redheadhammer.multidatabase.entities.SchoolViewModel;
import com.redheadhammer.multidatabase.entities.Student;

public class MainActivity extends AppCompatActivity {


    SchoolViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(SchoolViewModel.class);

        viewModel.insertSchool(new School("NVS"));
        viewModel.insertSchool(new School("NVS"));
        viewModel.insertSchool(new School("NVA"));
        viewModel.insertSchool(new School("DAV"));
    }
}
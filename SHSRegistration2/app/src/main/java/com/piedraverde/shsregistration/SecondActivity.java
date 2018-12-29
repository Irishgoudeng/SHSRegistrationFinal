package com.piedraverde.shsregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView tvAP, tvFN, tvG, tvRqts;

    String academicProgram, lastname, firstname, middlename, gender, requirements, full_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        tvAP = findViewById(R.id.tvAP);
        tvFN = findViewById(R.id.tvFN);
        tvG = findViewById(R.id.tvG);
        tvRqts = findViewById(R.id.tvRqts);


        Intent intent = getIntent();
        academicProgram = intent.getStringExtra("academicProgram");
        lastname = intent.getStringExtra("lastname");
        firstname = intent.getStringExtra("firstname");
        middlename = intent.getStringExtra("middlename");
        gender = intent.getStringExtra("gender");
        requirements = intent.getStringExtra("requirements");

        full_name = firstname + " " + middlename + " " + lastname;


        tvAP.setText(academicProgram);
        tvFN.setText(full_name);
        tvG.setText(gender);
        tvRqts.setText(requirements);
    }
}


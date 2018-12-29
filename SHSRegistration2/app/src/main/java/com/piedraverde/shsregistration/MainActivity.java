package com.piedraverde.shsregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    Spinner Tracks;
    EditText LastName, FirstName, MiddleName;
    RadioButton gMale, gFemale;
    CheckBox cb4, cb3, cb2, cb1;
    Button btn;


    String academicProgram, LN, FN, MN, G, RQTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Tracks = findViewById(R.id.spn);
        LastName = findViewById(R.id.LName);
        FirstName = findViewById(R.id.FName);
        MiddleName = findViewById(R.id.MName);
        gMale = findViewById(R.id.gMale);
        gFemale = findViewById(R.id.gFemale);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
    }

    public void submit(View view) {

        academicProgram = Tracks.getSelectedItem().toString();
        LN= LastName.getText().toString();
        FN = FirstName.getText().toString();
        MN = MiddleName.getText().toString();

        if(gMale.isChecked()) {
            G = "Male";
        }
        else {
            G = "Female";
        }

        RQTS = "";
        if(cb1.isChecked()) {
            RQTS = cb1.getText().toString() + "\n";
        }
        if(cb2.isChecked()) {
            RQTS =  RQTS + cb2.getText().toString() + "\n";
        }
        if(cb3.isChecked()) {
            RQTS =  RQTS + cb3.getText().toString() + "\n";
        }
        if(cb4.isChecked()) {
            RQTS = RQTS+ cb4.getText().toString() + "\n";

        }


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("academicProgram", academicProgram);
        intent.putExtra("lastname", LN);
        intent.putExtra("firstname", FN);
        intent.putExtra("middlename", MN);
        intent.putExtra("gender", G);
        intent.putExtra("requirements",  RQTS);
        startActivity(intent);



    }
}

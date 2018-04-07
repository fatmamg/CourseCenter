package com.example.neo.coursecenterworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CompleteRegister extends AppCompatActivity {
    private EditText lcName , hrNo , sbName ;
    private Button btnSave ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_register);
        lcName = findViewById(R.id.lecturerName);
        hrNo = findViewById(R.id.hoursNumber);
        sbName = findViewById(R.id.subjectsName);

        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

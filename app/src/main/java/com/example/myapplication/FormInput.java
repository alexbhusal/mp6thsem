package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FormInput extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forminput);
        Button btn = findViewById(R.id.formbtn);
        TextView faculty= findViewById(R.id.faculty);
        RadioGroup gender = findViewById(R.id.gender);
        TextView fullname= findViewById(R.id.fullname);


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String fname = fullname.getText().toString();
                String fclty = faculty.getText().toString();
                int selectedGenderId = gender.getCheckedRadioButtonId();
                RadioButton selectedGenderButton = findViewById(selectedGenderId);
                String gndr = selectedGenderButton != null ? selectedGenderButton.getText().toString() : "Not Selected";


                String fResult = "Student Name: "+fname+"\nFaculty: "+fclty+"\nGender : "+gndr;
                Intent i = new Intent(getApplicationContext(), FormResult.class);
                i.putExtra("key",fResult);
                startActivity(i);
            }
        });
    }
}

package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FormResult extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.formresult);
        String value = getIntent().getStringExtra("key");
        Toast.makeText(getApplicationContext(), "Result" + value, Toast.LENGTH_LONG).show();
        TextView ResultOut = findViewById(R.id.formres);
        ResultOut.setText("Student Details:  \n" + value);
    }
}

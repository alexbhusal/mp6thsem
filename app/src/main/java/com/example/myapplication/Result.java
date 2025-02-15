package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.result);
        float value = getIntent().getFloatExtra("key",0.0f);
        Toast.makeText(getApplicationContext(), "Result"+value, Toast.LENGTH_LONG).show();
        TextView ResultOut = findViewById(R.id.results);
        ResultOut.setText("Simple Interest: "+value);

    }
}

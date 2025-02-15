package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TextVie extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.textfile);

        int value = getIntent().getIntExtra("key",0);
        Toast.makeText(getApplicationContext(), "Result"+value, Toast.LENGTH_LONG).show();
    }
}

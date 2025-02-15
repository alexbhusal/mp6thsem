package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SimpleInterestActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event);

        Button btn = findViewById(R.id.btncal);
        EditText pri = findViewById(R.id.Principle);
        EditText tm = findViewById(R.id.times);
        EditText rt = findViewById(R.id.rate);
        TextView rout =findViewById(R.id.resultOut);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (pri.getText().length()<1 || tm.getText().length()<1 || rt.getText().length()<1){
                    Toast.makeText(getApplicationContext(),"Fields are required",Toast.LENGTH_LONG).show();
                }else {
                float pValue = Float.parseFloat(pri.getText().toString());
               float time = Float.parseFloat(tm.getText().toString());
               float rValue = Float.parseFloat(rt.getText().toString());

                   float result = (pValue * time * rValue) / 100;
                    Intent i = new Intent(getApplicationContext(), Result.class);
                    i.putExtra("key",result);
                    startActivity(i);

//                   rout.setText("Simple Interest: " + result);
               }
//                Toast.makeText(getApplicationContext(), "Simple Interest: " + result, Toast.LENGTH_LONG).show();
            }
        });

    }
}

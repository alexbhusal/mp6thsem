package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public  void onCreate(@Nullable Bundle b) {
        super.onCreate(b);
//        setContentView(R.layout.main);
//        setContentView((R.layout.form));
//        setContentView((R.layout.form_relative));
//        setContentView((R.layout.form_cons));
//        setContentView(R.layout.event);
        Toast.makeText(getApplicationContext(), "Oncreate Method Called", Toast.LENGTH_LONG).show();
    }
        public void onStart(){
            super.onStart();
            Log.d("activity Life Cycle","onstart is called");
            Toast.makeText(getApplicationContext(),"OnStart Method Called", Toast.LENGTH_LONG).show();
        }
        public void onResume() {
            super.onResume();
            Log.d("activity Life Cycle", "OnResume is called");
            Toast.makeText(getApplicationContext(), "OnResume Method Called", Toast.LENGTH_LONG).show();
        }
        public void  onPause(){
            super.onPause();
            Log.d("activity Life Cycle", "OnPause is called");
            Toast.makeText(getApplicationContext(), "OnPause Method Called", Toast.LENGTH_LONG).show();
        }

        public void onRestart(){
            super.onRestart();
            Log.d("activity Life Cycle", "onRestart is called");
            Toast.makeText(getApplicationContext(), "OnRestart Method Called", Toast.LENGTH_LONG).show();
        }

        public void onDestroy(){
        super.onDestroy();
            Log.d("activity Life Cycle", "OnDestroy is called");
            Toast.makeText(getApplicationContext(), "OnDestroy Method Called", Toast.LENGTH_LONG).show();
        }




}

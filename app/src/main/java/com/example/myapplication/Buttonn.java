package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Buttonn extends Activity {
    @Override
    public void onCreate(@Nullable Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.buttonn);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                explicit INTENT
//                Intent i = new Intent(getApplicationContext(), TextVie.class);
//                i.putExtra("key",10);

//                implicit INTENT
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse( "https://bhuvanbhusal.com.np"));
                startActivity(i);
            }
        });

    }
}

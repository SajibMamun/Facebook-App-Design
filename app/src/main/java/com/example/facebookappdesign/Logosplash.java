package com.example.facebookappdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Logosplash extends AppCompatActivity {
    LinearLayout logopage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logosplash);
        logopage=findViewById(R.id.logopageid);

        logopage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Logosplash.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.facebookappdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CreateAccount extends AppCompatActivity {
  LinearLayout signupbutton;
  TextView alreadyaccount;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        signupbutton=findViewById(R.id.signupbuttonid);
        alreadyaccount=findViewById(R.id.alreadyaccountid);

        alreadyaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CreateAccount.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
package com.example.facebookappdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout createaccountbutton,loginbutton;
    EditText loguserphoneoremail,logpassword;
    TextView forgotbutton;
    Spinner spinner;
    String userphoneoremail,userpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loguserphoneoremail=findViewById(R.id.logphoneoremailid);
        logpassword=findViewById(R.id.logpasswordid);
        loginbutton=findViewById(R.id.loginbuttonid);
        createaccountbutton=findViewById(R.id.createaccountid);
        forgotbutton=findViewById(R.id.forgotpasswordid);

        init();

        ArrayAdapter<CharSequence> arrayAdapter=ArrayAdapter.createFromResource(this,R.array.item,R.layout.support_simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                userphoneoremail=loguserphoneoremail.getText().toString().trim();
                userpassword=logpassword.getText().toString().trim();

                if(userphoneoremail.isEmpty())
                {
                    loguserphoneoremail.setError("Enter User Phone or Email");
                }
                else if(userpassword.isEmpty())
                {
                    logpassword.setError("Enter Password");
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login Successful!....",Toast.LENGTH_LONG).show();
                }
            }
        });

        forgotbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Go to forgot account page", Toast.LENGTH_SHORT).show();
            }
        });




        createaccountbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CreateAccount.class);
                startActivity(intent);


            }
        });
    }

    private void  init()
    {
        spinner=findViewById(R.id.spinnerid);
    }
    }

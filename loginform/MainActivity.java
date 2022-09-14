package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {


    EditText T1,T2;
    Button B1,B2;
    TextView T3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        T1=(EditText) findViewById(R.id.un);
        T2=(EditText) findViewById(R.id.ps);
        T3=(TextView) findViewById(R.id.Te1);

        B1=(Button) findViewById(R.id.b01);
        B2=(Button) findViewById(R.id.b02);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T3.setText("Username "+ T1.getText().toString()+"Password"+T2.getText().toString() );
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                T1.setText(" ");
                T2.setText(" ");
            }
        });



    }

}
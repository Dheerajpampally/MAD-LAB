package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1,b2,b3,b4,b5,b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.e01);
        e2=(EditText) findViewById(R.id.e02);
        e3=(EditText) findViewById(R.id.e03);

        b1=(Button) findViewById(R.id.b01);
        b2=(Button) findViewById(R.id.b02);
        b3=(Button) findViewById(R.id.b03);
        b4=(Button) findViewById(R.id.b04);
        b5=(Button) findViewById(R.id.b05);
        b6=(Button) findViewById(R.id.b06);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!e1.getText().toString().equals("")&&!e2.getText().toString().equals("")){

                    int a=Integer.parseInt(e1.getText().toString());
                    int b=Integer.parseInt(e2.getText().toString());

                    int c=a+b;

                    e3.setText(Integer.toString(c));
                }

                else{
                    Toast.makeText(getApplicationContext(), "Fill", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!e1.getText().toString().equals("")&&!e2.getText().toString().equals("")){


                    int a=Integer.parseInt(e1.getText().toString());
                    int b=Integer.parseInt(e2.getText().toString());

                    int c=a-b;

                    e3.setText(Integer.toString(c));
                }

                else{
                    Toast.makeText(getApplicationContext(), "Fill", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!e1.getText().toString().equals("")&&!e2.getText().toString().equals("")){

                    int a=Integer.parseInt(e1.getText().toString());
                    int b=Integer.parseInt(e2.getText().toString());

                    int c=a*b;

                    e3.setText(Integer.toString(c));

                }
                else{
                    Toast.makeText(getApplicationContext(), "Fill", Toast.LENGTH_SHORT).show();
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!e1.getText().toString().equals("")&&!e2.getText().toString().equals("")){

                    int a=Integer.parseInt(e1.getText().toString());
                    int b=Integer.parseInt(e2.getText().toString());

                    int c=a/b;

                    e3.setText(Integer.toString(c));

                }
                else{
                    Toast.makeText(getApplicationContext(), "Fill", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!e1.getText().toString().equals("")&&!e2.getText().toString().equals("")){

                    int a=Integer.parseInt(e1.getText().toString());
                    int b=Integer.parseInt(e2.getText().toString());

                    int c=a%b;

                    e3.setText(Integer.toString(c));

                }
                else{
                    Toast.makeText(getApplicationContext(), "Fill", Toast.LENGTH_SHORT).show();
                }

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                e1.setText("");
                e2.setText("");
                e3.setText("");
                Toast.makeText(getApplicationContext(), "Clearing Box", Toast.LENGTH_SHORT).show();

            }
        });

    }
}




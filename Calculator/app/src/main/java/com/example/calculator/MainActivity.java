package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button add_bt, sub_bt, mul_bt, div_bt, advanced_bt;
    private TextView result_tv;
    private EditText num1_et, num2_et;

    float result;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_bt= findViewById(R.id.add_bt);
        sub_bt= findViewById(R.id.sub_bt);
        mul_bt= findViewById(R.id.mul_bt);
        div_bt= findViewById(R.id.div_bt);
        advanced_bt= findViewById(R.id.advanced_bt);


        result_tv= findViewById(R.id.Result_tv);
        num1_et =  findViewById(R.id.Num1_et);
        num2_et =  findViewById(R.id.Num2_et);


        add_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                String snum1, snum2;
                snum1= num1_et.getText().toString();
                snum2= num2_et.getText().toString();

                if(snum1.isEmpty()){
                    Toast.makeText(MainActivity.this, "No Number Entered in first field", Toast.LENGTH_SHORT).show();
                    return;
                }

                else if(snum2.isEmpty()){
                    Toast.makeText(MainActivity.this, "No Number Entered in Second field", Toast.LENGTH_SHORT).show();
                    return;
                }


                num1= Integer.parseInt(snum1);
                num2= Integer.parseInt(snum2);
                    result = (float) num1 + num2;
                    result_tv.setText(String.valueOf(result));

            }
        } );

        sub_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                String snum1, snum2;
                snum1= num1_et.getText().toString();
                snum2= num2_et.getText().toString();

                if(snum1.isEmpty()){
                    Toast.makeText(MainActivity.this, "No Number Entered in first field", Toast.LENGTH_SHORT).show();
                    return;
                }

                else if(snum2.isEmpty()){
                    Toast.makeText(MainActivity.this, "No Number Entered in Second field", Toast.LENGTH_SHORT).show();
                    return;
                }


                num1= Integer.parseInt(snum1);
                num2= Integer.parseInt(snum2);
                result = (float) num1 - num2;
                result_tv.setText(String.valueOf(result));

            }
        } );


        mul_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                String snum1, snum2;
                snum1= num1_et.getText().toString();
                snum2= num2_et.getText().toString();

                if(snum1.isEmpty()){
                    Toast.makeText(MainActivity.this, "No Number Entered in first field", Toast.LENGTH_SHORT).show();
                    return;
                }

                else if(snum2.isEmpty()){
                    Toast.makeText(MainActivity.this, "No Number Entered in Second field", Toast.LENGTH_SHORT).show();
                    return;
                }


                num1= Integer.parseInt(snum1);
                num2= Integer.parseInt(snum2);
                result = (float) num1 * (float) num2;
                result_tv.setText(String.valueOf(result));

            }
        } );


        div_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                String snum1, snum2;
                snum1= num1_et.getText().toString();
                snum2= num2_et.getText().toString();

                if(snum1.isEmpty()){
                    Toast.makeText(MainActivity.this, "No Number Entered in first field", Toast.LENGTH_SHORT).show();
                    return;
                }

                else if(snum2.isEmpty()){
                    Toast.makeText(MainActivity.this, "No Number Entered in Second field", Toast.LENGTH_SHORT).show();
                    return;
                }


                num1= Integer.parseInt(snum1);
                num2= Integer.parseInt(snum2);
                result = num1 / (float) num2;
                result_tv.setText(String.valueOf(result));

            }
        } );

        advanced_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {


                open_advanced_activity();
            }
        } );

    }

    public void open_advanced_activity(){

        Intent intent = new Intent(this, advanced_calc.class);
        startActivity(intent);


    }
}

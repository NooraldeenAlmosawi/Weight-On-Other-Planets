package com.nooraldeen.calculateweight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    RadioGroup rdGroup;
    RadioButton rd1, rd2, rd3, rd4, rd5;
    Button btnCalculate;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        editText=findViewById (R.id.txtWeight);
        rdGroup = findViewById (R.id.rdGroup);
        btnCalculate = findViewById (R.id.Calculate);
        rd1 = findViewById (R.id.radioMercury);
        rd2 = findViewById (R.id.radioMars);
        rd3 = findViewById (R.id.radioVenus);
        rd4 = findViewById (R.id.radioUranus);
        rd5 = findViewById (R.id.radioNeptune);
        textView=findViewById (R.id.txtRes);


    }

    public void onRadioButtonClicked(View view) {
        int id = rdGroup.getCheckedRadioButtonId();
        String str = "";
        switch (id) {


            case R.id.radioMercury:
                if (rd1.isChecked ()){
                    str= editText.getText().toString();
                double a = Double.parseDouble (str);
                a= (a*3.7)/9.81;
                textView.setText(new Double (a).toString());}
                break;


            case R.id.radioMars:
                if (rd2.isChecked ()){

                    str= editText.getText().toString();
                    double a = Double.parseDouble (str);
                    a= (a*3.711)/9.81;
                    String finalresult = new Double(a).toString();
                    textView.setText(finalresult);}


                break;


            case R.id.radioVenus:
                if (rd3.isChecked ()){
                    str= editText.getText().toString();
                    double a = Double.parseDouble (str);
                    a= (a*8.87)/9.81;
                    String finalresult = new Double(a).toString();
                    textView.setText(finalresult);

                }

                break;


            case R.id.radioUranus:
                if (rd4.isChecked ()){
                    str= editText.getText().toString();
                    double a = Double.parseDouble (str);
                    a= (a*8.69  )/9.81;
                    String finalresult = new Double(a).toString();
                    textView.setText(finalresult);
                }
                break;


            case R.id.radioNeptune:
                if (rd5.isChecked ()){
                    str= editText.getText().toString();
                    double a = Double.parseDouble (str);
                    a= (a*11.15)/9.81;
                    String finalresult = new Double(a).toString();
                    textView.setText(finalresult);
                }
                break;
        }
    }
}
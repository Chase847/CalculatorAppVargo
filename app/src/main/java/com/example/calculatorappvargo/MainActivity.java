package com.example.calculatorappvargo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String inputTVDisplay = "";

    TextView inTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inTV = findViewById(R.id.inputTV);
    }



    public void addDigit(View v) {
        String output = "";
        if(v.getId() ==  R.id.button1){
            output = inputTVDisplay + "1";
        }
        else if(v.getId() ==  R.id.button2){
            output = inputTVDisplay + "2";
        }
        else if(v.getId() ==  R.id.button3){
            output = inputTVDisplay + "3";
        }
        else if(v.getId() ==  R.id.button4){
            output = inputTVDisplay + "4";
        }
        else if(v.getId() ==  R.id.button5){
            output = inputTVDisplay + "5";
        }
        else if(v.getId() ==  R.id.button6){
            output = inputTVDisplay + "6";
        }
        else if(v.getId() ==  R.id.button7){
            output = inputTVDisplay + "7";
        }
        else if(v.getId() ==  R.id.button8){
            output = inputTVDisplay + "8";
        }
        else if(v.getId() ==  R.id.button9){
            output = inputTVDisplay + "9";
        }
        else{
            output = inputTVDisplay + "0";
        }
        inputTVDisplay = output;
        inTV.setText(inputTVDisplay);
    }
}
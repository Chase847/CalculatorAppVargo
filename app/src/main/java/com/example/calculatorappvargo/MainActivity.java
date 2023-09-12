package com.example.calculatorappvargo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String inputTVDisplay = "";
    String firstNum = "";
    String secondNum = "";
    boolean isSecondNum = false;
    boolean isFirstClick = true;
    String sign = "";
    String firstHistoryTV = "";
    String secondHistoryTV = "";



    TextView inTV;
    TextView fHTV;
    TextView sHTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inTV = findViewById(R.id.inputTV);
        fHTV = findViewById(R.id.historyTV1);
        sHTV = findViewById(R.id.historyTV2);
    }



    public void addDigit(View v) {
        if (!isSecondNum) {
            if (v.getId() == R.id.button1) {
                inputTVDisplay = inputTVDisplay + "1";
                firstNum += "1";
            } else if (v.getId() == R.id.button2) {
                inputTVDisplay = inputTVDisplay + "2";
                firstNum += "2";
            } else if (v.getId() == R.id.button3) {
                inputTVDisplay = inputTVDisplay + "3";
                firstNum += "3";
            } else if (v.getId() == R.id.button4) {
                inputTVDisplay = inputTVDisplay + "4";
                firstNum += "4";
            } else if (v.getId() == R.id.button5) {
                inputTVDisplay = inputTVDisplay + "5";
                firstNum += "5";
            } else if (v.getId() == R.id.button6) {
                inputTVDisplay = inputTVDisplay + "6";
                firstNum += "6";
            } else if (v.getId() == R.id.button7) {
                inputTVDisplay = inputTVDisplay + "7";
                firstNum += "7";
            } else if (v.getId() == R.id.button8) {
                inputTVDisplay = inputTVDisplay + "8";
                firstNum += "8";
            } else if (v.getId() == R.id.button9) {
                inputTVDisplay = inputTVDisplay + "9";
                firstNum += "9";
            } else if (v.getId() == R.id.button0) {
                inputTVDisplay = inputTVDisplay + "0";
                firstNum += "0";
            } else if (v.getId() == R.id.additionButton) {
                isSecondNum = true;
                isFirstClick = true;
                sign = "+";
            } else if (v.getId() == R.id.subtractionButton) {
                if(isFirstClick){
                    firstNum += "-";
                }
                else {
                    isSecondNum = true;
                    sign = "-";
                }
            } else if (v.getId() == R.id.multiplicationButton) {
                isSecondNum = true;
                isFirstClick = true;
                sign = "*";
            } else if (v.getId() == R.id.divisionButton) {
                isSecondNum = true;
                isFirstClick = true;
                sign = "/";
            } else if (v.getId() == R.id.enterButton) {
                calculate(v);
            } else if (v.getId() == R.id.clearButton) {
                secondHistoryTV = firstHistoryTV;
                firstHistoryTV = inputTVDisplay;
                inputTVDisplay = "";
                firstNum = "";
                secondNum = "";
                isSecondNum = false;
            } else if (v.getId() == R.id.decimalPointButton) {
                inputTVDisplay = inputTVDisplay + ".";
            }
            if(isFirstClick){
                isFirstClick = false;
            }
        }
        else{
            inTV.setText("");
            if (v.getId() == R.id.button1) {
                inputTVDisplay = inputTVDisplay + "1";
                secondNum += "1";
            } else if (v.getId() == R.id.button2) {
                inputTVDisplay = inputTVDisplay + "2";
                secondNum += "2";
            } else if (v.getId() == R.id.button3) {
                inputTVDisplay = inputTVDisplay + "3";
                secondNum += "3";
            } else if (v.getId() == R.id.button4) {
                inputTVDisplay = inputTVDisplay + "4";
                secondNum += "4";
            } else if (v.getId() == R.id.button5) {
                inputTVDisplay = inputTVDisplay + "5";
                secondNum += "5";
            } else if (v.getId() == R.id.button6) {
                inputTVDisplay = inputTVDisplay + "6";
                secondNum += "6";
            } else if (v.getId() == R.id.button7) {
                inputTVDisplay = inputTVDisplay + "7";
                secondNum += "7";
            } else if (v.getId() == R.id.button8) {
                inputTVDisplay = inputTVDisplay + "8";
                secondNum += "8";
            } else if (v.getId() == R.id.button9) {
                inputTVDisplay = inputTVDisplay + "9";
                secondNum += "9";
            } else if (v.getId() == R.id.button0) {
                inputTVDisplay = inputTVDisplay + "0";
                secondNum += "0";
            } else if (v.getId() == R.id.additionButton) {
                isSecondNum = true;
            } else if (v.getId() == R.id.subtractionButton) {
                if(isFirstClick){
                    firstNum += "-";
                }
                else {
                    isSecondNum = true;
                    sign = "-";
                }
            } else if (v.getId() == R.id.multiplicationButton) {
                isSecondNum = true;
            } else if (v.getId() == R.id.divisionButton) {
                isSecondNum = true;
            } else if (v.getId() == R.id.enterButton) {
                calculate(v);
            } else if (v.getId() == R.id.clearButton) {
                secondHistoryTV = firstHistoryTV;
                firstHistoryTV = inputTVDisplay;
                inputTVDisplay = "";
                firstNum = "";
                secondNum = "";
                isSecondNum = false;
            } else if (v.getId() == R.id.decimalPointButton) {
                inputTVDisplay = inputTVDisplay + ".";
            }
        }

        inTV.setText(inputTVDisplay);
        fHTV.setText(firstHistoryTV);
        sHTV.setText(secondHistoryTV);
    }

    public void calculate(View v){
        double fNum = Integer.valueOf(firstNum);
        double sNum = Integer.valueOf(secondNum);
        double value = 0;
        if (sign.equals("+")){
            value = fNum + sNum;
        }
        else if (sign.equals("-")){
            value = fNum - sNum;
        }
        else if (sign.equals("*")){
            value = fNum * sNum;
        }
        else if (sign.equals("/")){
            value = fNum/sNum;
        }
        inputTVDisplay = value + "";
        inTV.setText(inputTVDisplay);

    }
}
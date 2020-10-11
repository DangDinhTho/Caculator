package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtShow;
    boolean isOp, isResult;
    String op;
    int oldNumber;
    int result;
    int newNumber;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtShow = findViewById(R.id.txtShow);
        isOp = false;
        oldNumber = 0;
        isResult = false;
        op = "null";

    }

    public  void numberEvent(View view){

         number = txtShow.getText().toString();

        switch (view.getId()){
            case R.id.n0:

                if(number.equals("0")) break;
                if(op != "null") {
                    oldNumber = Integer.parseInt(number);
                    number = "";
                    isOp = false;
                }
                if(isResult){
                    oldNumber = 0;
                    number = "";
                    isOp = false;
                    op = "null";
                    isResult = false;
                }
                number += '0';
                break;
            case R.id.n1:
                if(number.equals("0")) number = "";
                if(op != "null") {
                    oldNumber = Integer.parseInt(number);
                    number = "";
                    isOp = false;
                }
                if(isResult){
                    oldNumber = 0;
                    number = "";
                    isOp = false;
                    op = "null";
                    isResult = false;
                }
                number += '1';
                break;
            case R.id.n2:
                if(number.equals("0")) number = "";
                if(op != "null") {
                    oldNumber = Integer.parseInt(number);
                    number = "";
                    isOp = false;
                }
                if(isResult){
                    oldNumber = 0;
                    number = "";
                    isOp = false;
                    isResult = false;
                    op = "null";
                }
                number += '2';
                break;
            case R.id.n3:
                if(number.equals("0")) number = "";
                if(!op.equals("null") && !number.equals("") ) {
                    oldNumber = Integer.parseInt(number);
                    number = "";
                    isOp = false;
                }
                if(isResult){
                    oldNumber = 0;
                    number = "";
                    isOp = false;
                    isResult = false;
                    op = "null";
                }
                number += '3';
                break;
            case R.id.n4:
                if(number.equals("0")) number = "";
                if(op != "null") {
                    oldNumber = Integer.parseInt(number);
                    number = "";
                    isOp = false;
                }
                if(isResult){
                    oldNumber = 0;
                    number = "";
                    isOp = false;
                    isResult = false;
                    op = "null";
                }
                number += '4';
                break;
            case R.id.n5:
                if(number.equals("0")) number = "";
                if(op != "null") {
                    oldNumber = Integer.parseInt(number);
                    number = "";
                    isOp = false;
                }
                if(isResult){
                    oldNumber = 0;
                    number = "";
                    isOp = false;
                    isResult = false;
                    op = "null";
                }
                number += '5';
                break;
            case R.id.n6:
                if(number.equals("0")) number = "";
                if(op != "null") {
                    oldNumber = Integer.parseInt(number);
                    number = "";
                    isOp = false;
                }
                if(isResult){
                    oldNumber = 0;
                    number = "";
                    isOp = false;
                    op = "null";
                    isResult = false;
                }
                number += '6';
                break;
            case R.id.n7:
                if(number.equals("0")) number = "";
                if(op != "null") {
                    oldNumber = Integer.parseInt(number);
                    number = "";
                    isOp = false;
                }
                if(isResult){
                    oldNumber = 0;
                    number = "";
                    isOp = false;
                    op = "null";
                    isResult = false;
                }
                number += '7';
                break;
            case R.id.n8:
                if(number.equals("0")) number = "";
                if(op != "null") {
                    oldNumber = Integer.parseInt(number);
                    number = "";
                    isOp = false;
                }
                if(isResult){
                    oldNumber = 0;
                    number = "";
                    isOp = false;
                    op = "null";
                    isResult = false;
                }
                number += '8';
                break;
            case R.id.n9:
                if(number.equals("0")) number = "";
                if(op != "null") {
                    oldNumber = Integer.parseInt(number);
                    number = "";
                    isOp = false;
                }
                if(isResult){
                    oldNumber = 0;
                    number = "";
                    isOp = false;
                    op = "null";
                    isResult = false;
                }
                number += '9';
                break;

            case R.id.dot:
                number += ".";
                break;
            case R.id.add:
                op = "+";
                isOp = true;
                break;
            case R.id.minus:
                op = "-";
                isOp = true;
                break;
            case R.id.multiply:

                op = "x";
                isOp = true;
                break;
            case R.id.divide:
                op = "/";
                isOp = true;
                break;
            case R.id.bs:
                if(number.equals("0")) break;
                if(isResult){
                    oldNumber = 0;
                    number = "0";
                    isOp = false;
                    op = "null";
                    isResult = false;
                    break;
                }
                if(number.length() == 1) {
                    number = "0";
                    break;
                }
                StringBuilder stringBuilder = new StringBuilder(number);
              stringBuilder.deleteCharAt(number.length()-1);
              number = stringBuilder.toString();
                break;

            case R.id.c:
                oldNumber = 0;
                number = "0";
                isOp = false;
                op = "null";
                isResult = false;
                break;
            case R.id.ce:
                if(isResult){
                    oldNumber = 0;
                    isOp = false;
                    op = "null";
                    isResult = false;
                }
                number = "0";
                break;

            case R.id.equals:
                //if(oldNumber == 0) break;
                if(op == "null"){
                    break;
                }
                newNumber  = Integer.parseInt(number);
                switch (op){
                    case "+":
                        result = oldNumber + newNumber;
                        break;
                    case "-":
                        result = oldNumber - newNumber;
                        break;
                    case "x":
                        result = oldNumber * newNumber;
                        break;
                    case "/":
                        result = oldNumber / newNumber;
                        break;
                }

                number =result + "";
                isOp = true;
                oldNumber = result;
                isResult = true;
                break;
        }


        txtShow.setText(number);
    }

}
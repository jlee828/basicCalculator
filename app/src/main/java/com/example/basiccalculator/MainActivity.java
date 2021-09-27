package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void sub(View view){
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String n1 = firstNumber.getText().toString();
        String n2 = secondNumber.getText().toString();
        subActivity(n1, n2);
    }

    public void subActivity(String s, String s2){
        Intent intent = new Intent(this, MainActivity2.class);
        int sum = Integer.parseInt(s) - Integer.parseInt(s2);;
        intent.putExtra("message", Integer.toString(sum));
        startActivity(intent);
    }

    public void add(View view){
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String n1 = firstNumber.getText().toString();
        String n2 = secondNumber.getText().toString();
        addActivity(n1, n2);
    }

    public void addActivity(String s, String s2){
        Intent intent = new Intent(this, MainActivity2.class);
        int sum = Integer.parseInt(s) + Integer.parseInt(s2);;
        intent.putExtra("message", Integer.toString(sum));
        startActivity(intent);
    }

    public void mul(View view){
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String n1 = firstNumber.getText().toString();
        String n2 = secondNumber.getText().toString();
        mulActivity(n1, n2);
    }

    public void mulActivity(String s, String s2){
        Intent intent = new Intent(this, MainActivity2.class);
        int sum = Integer.parseInt(s) * Integer.parseInt(s2);;
        intent.putExtra("message", Integer.toString(sum));
        startActivity(intent);
    }

    public void div(View view){
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String n1 = firstNumber.getText().toString();
        String n2 = secondNumber.getText().toString();
        divActivity(n1, n2);
    }

    public void divActivity(String s, String s2){
        Intent intent = new Intent(this, MainActivity2.class);
        int sum = Integer.parseInt(s) / Integer.parseInt(s2);;
        intent.putExtra("message", Integer.toString(sum));
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
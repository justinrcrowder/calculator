package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double result = 0;

    public void additionFunction(View view) {
        EditText integer1=(EditText) findViewById(R.id.integer1);
        EditText integer2=(EditText) findViewById(R.id.integer2);
        int num1 = Integer.parseInt(integer1.getText().toString());
        int num2 = Integer.parseInt(integer2.getText().toString());
        result = num1 + num2;
        goToResult("" + result);
    }

    public void subtractionFunction(View view) {
        EditText integer1=(EditText) findViewById(R.id.integer1);
        EditText integer2=(EditText) findViewById(R.id.integer2);
        int num1 = Integer.parseInt(integer1.getText().toString());
        int num2 = Integer.parseInt(integer2.getText().toString());
        result = num1 - num2;
        goToResult("" + result);
    }

    public void multiplicationFunction(View view) {
        EditText integer1=(EditText) findViewById(R.id.integer1);
        EditText integer2=(EditText) findViewById(R.id.integer2);
        int num1 = Integer.parseInt(integer1.getText().toString());
        int num2 = Integer.parseInt(integer2.getText().toString());
        result = num1 * num2;
        goToResult("" + result);
    }

    public void divisionFunction(View view) {
        EditText integer1=(EditText) findViewById(R.id.integer1);
        EditText integer2=(EditText) findViewById(R.id.integer2);
        int num1 = Integer.parseInt(integer1.getText().toString());
        int num2 = Integer.parseInt(integer2.getText().toString());
        if (num2 == 0) {
            Toast.makeText(MainActivity.this, "Cannot divide by zero!", Toast.LENGTH_LONG).show();
        } else {
            double result1 = num1 / num2;
            goToResult("" + result1);
        }
    }
    public void goToResult(String result) {
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
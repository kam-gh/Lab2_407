package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addition(View view) {

        int intValue1 = 0;
        int intValue2 = 0;

        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String text1 = myTextField1.getText().toString();

        try {
            intValue1 = Integer.parseInt(text1);
        } catch (Exception e) {
            goToActivity("Error: Must enter two integers");
            return;
        }


        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String text2 = myTextField2.getText().toString();

        try {
            intValue2 = Integer.parseInt(text2);
        } catch (Exception e) {
            goToActivity("Error: Must enter two integers");
            return;
        }

        int finalVal = intValue1 + intValue2;
        String finalStr = String.valueOf(finalVal);

        goToActivity(finalStr);
    }

    public void subtraction(View view) {

        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String text1 = myTextField1.getText().toString();
        int intValue1 = Integer.parseInt(text1);

        try {
            intValue1 = Integer.parseInt(text1);
        } catch (Exception e) {
            goToActivity("Error: Must enter two integers");
            return;
        }

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String text2 = myTextField2.getText().toString();
        int intValue2 = Integer.parseInt(text2);

        try {
            intValue2 = Integer.parseInt(text2);
        } catch (Exception e) {
            goToActivity("Error: Must enter two integers");
            return;
        }

        int finalVal = intValue1 - intValue2;
        String finalStr = String.valueOf(finalVal);

        goToActivity(finalStr);
    }

    public void multiplication(View view) {

        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String text1 = myTextField1.getText().toString();
        int intValue1 = Integer.parseInt(text1);

        try {
            intValue1 = Integer.parseInt(text1);
        } catch (Exception e) {
            goToActivity("Error: Must enter two integers");
            return;
        }

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String text2 = myTextField2.getText().toString();
        int intValue2 = Integer.parseInt(text2);

        try {
            intValue2 = Integer.parseInt(text2);
        } catch (Exception e) {
            goToActivity("Error: Must enter two integers");
            return;
        }

        int finalVal = intValue1 * intValue2;
        String finalStr = String.valueOf(finalVal);

        goToActivity(finalStr);
    }

    public void division(View view) {

        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String text1 = myTextField1.getText().toString();
        int intValue1 = Integer.parseInt(text1);

        try {
            intValue1 = Integer.parseInt(text1);
        } catch (Exception e) {
            goToActivity("Error: Must enter two integers");
            return;
        }

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String text2 = myTextField2.getText().toString();
        int intValue2 = Integer.parseInt(text2);
        if (intValue2 == 0) {
            goToActivity("Error: Divide by 0.");
        }

        try {
            intValue2 = Integer.parseInt(text2);
        } catch (Exception e) {
            goToActivity("Error: Must enter two integers");
            return;
        }

        int finalVal = intValue1 / intValue2;
        String finalStr = String.valueOf(finalVal);

        goToActivity(finalStr);
    }

    public void goToActivity(String result) {
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("message", result);
        startActivity(intent);
    }
}
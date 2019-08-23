package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addition(View v) {
        EditText el1 = (EditText) findViewById(R.id.num1);
        EditText el2 = (EditText) findViewById(R.id.num2);
        TextView resText = (TextView) findViewById(R.id.result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int result = num1 + num2;
        resText.setText(Integer.toString(result));
    }

    public void subtraction(View v) {
        EditText el1 = (EditText) findViewById(R.id.num1);
        EditText el2 = (EditText) findViewById(R.id.num2);
        TextView resText = (TextView) findViewById(R.id.result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int result = num1 - num2;
        resText.setText(Integer.toString(result));
    }

    public void multiplication(View v) {
        EditText el1 = (EditText) findViewById(R.id.num1);
        EditText el2 = (EditText) findViewById(R.id.num2);
        TextView resText = (TextView) findViewById(R.id.result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int result = num1 * num2;
        resText.setText(Integer.toString(result));
    }

    public void division(View v) {
        EditText el1 = (EditText) findViewById(R.id.num1);
        EditText el2 = (EditText) findViewById(R.id.num2);
        TextView resText = (TextView) findViewById(R.id.result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());

        if (num2 == 0) {
            resText.setText("На 0 делить нельзя!");
        } else{
            int result = num1 / num2;
            resText.setText(Integer.toString(result));
        }
    }
}

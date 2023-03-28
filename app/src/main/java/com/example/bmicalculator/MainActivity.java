package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText height;
    TextInputEditText weight;

    TextInputEditText bmiValue;

    Button calButton;
    Button clButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.weightId);
        weight = findViewById(R.id.heigthId);

        bmiValue = findViewById(R.id.bmiValue);

        calButton = findViewById(R.id.buttonClear);
        clButton = findViewById(R.id.buttonCla1);


        clButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            double height1 = Double.parseDouble(height.getText().toString());
            double weight1 = Double.parseDouble(weight.getText().toString());
            double result = (height1 / (weight1 * weight1))* 703; ;
            bmiValue.setText(Double.toString(Math.round(result)));
            }
        });

        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            height.setText("");
            weight.setText("");
            bmiValue.setText("");
            }
        });
    }
}
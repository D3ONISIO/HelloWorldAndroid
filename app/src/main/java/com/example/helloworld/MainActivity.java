package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.helloworld.R;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView1);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button additionButton = findViewById(R.id.additionButton);
        Button substractionButton = findViewById(R.id.substractionButton);
        Button equalButton = findViewById(R.id.equalButton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {textView.setText("3");}
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {textView.setText("4");}
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {textView.setText("5");}
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {textView.setText("6");}
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {textView.setText("7");}
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {textView.setText("8");}
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {textView.setText("9");}
        });

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {textView.setText("+");}
        });

        substractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {textView.setText("-");}
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {textView.setText("=");}
        });
    }
}

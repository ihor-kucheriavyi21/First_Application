package com.devexpert.firstappliacation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);
        Button clickMeButton = findViewById(R.id.buttonId1);
        TextView textView = findViewById(R.id.textView1);
        clickMeButton.setOnClickListener(listener->{
            textView.setText("Button clicked!!");
            textView.setTextColor(Color.RED);
        });
    }
}
package com.example.schoolproj;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
    }

    public void onMathClass7Click(View view) {
        Intent intent = new Intent(MathActivity.this, MathClass7Activity.class);
        MathActivity.this.startActivity(intent);
    }

    public void onMathClass8Click(View view) {
        Intent intent = new Intent(MathActivity.this, MathClass8Activity.class);
        MathActivity.this.startActivity(intent);
    }

    public void onMathClass9Click(View view) {
        Intent intent = new Intent(MathActivity.this, MathClass9Activity.class);
        MathActivity.this.startActivity(intent);
    }
}
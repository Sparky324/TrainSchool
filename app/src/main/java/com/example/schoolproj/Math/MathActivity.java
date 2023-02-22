package com.example.schoolproj.Math;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schoolproj.Math.Class7.MathClass7Activity;
import com.example.schoolproj.Math.Class8.MathClass8Activity;
import com.example.schoolproj.Math.Class9.MathClass9Activity;
import com.example.schoolproj.R;

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
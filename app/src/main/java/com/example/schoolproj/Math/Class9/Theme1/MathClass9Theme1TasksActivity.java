package com.example.schoolproj.Math.Class9.Theme1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.Math.Class9.Theme1.Var1.MathClass9Theme1TasksVar1Activity;
import com.example.schoolproj.R;

public class MathClass9Theme1TasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class9_theme1_tasks);
    }

    public void onVar1Click(View view) {
        Intent intent = new Intent(MathClass9Theme1TasksActivity.this, MathClass9Theme1TasksVar1Activity.class);
        startActivity(intent);
    }
}
package com.example.schoolproj.Math.Class9.Theme2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.Math.Class9.Theme2.Var1.MathClass9Theme2TasksVar1Activity;
import com.example.schoolproj.R;

public class MathClass9Theme2TasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class9_theme2_tasks);
    }

    public void OnVar1Click(View view) {
        Intent intent = new Intent(MathClass9Theme2TasksActivity.this, MathClass9Theme2TasksVar1Activity.class);
        startActivity(intent);
    }
}
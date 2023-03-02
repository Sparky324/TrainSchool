package com.example.schoolproj.Math.Class8.Theme2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.Math.Class8.Theme2.Var1.MathClass8Theme2TasksVar1Activity;
import com.example.schoolproj.R;

public class MathClass8Theme2TasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class8_theme2_tasks);
    }

    public void onVar1MathClass71Click(View view) {
        Intent intent = new Intent(MathClass8Theme2TasksActivity.this, MathClass8Theme2TasksVar1Activity.class);
        startActivity(intent);
    }
}
package com.example.schoolproj.Math.Class8.Theme3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.Math.Class8.Theme2.MathClass8Theme2TasksActivity;
import com.example.schoolproj.Math.Class8.Theme2.Var1.MathClass8Theme2TasksVar1Activity;
import com.example.schoolproj.Math.Class8.Theme3.Var1.MathClass8Theme3TasksVar1Activity;
import com.example.schoolproj.R;

public class MathClass8Theme3TasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class8_theme3_tasks);
    }

    public void onVar1MathClass71Click(View view) {
        Intent intent = new Intent(MathClass8Theme3TasksActivity.this, MathClass8Theme3TasksVar1Activity.class);
        startActivity(intent);
    }
}
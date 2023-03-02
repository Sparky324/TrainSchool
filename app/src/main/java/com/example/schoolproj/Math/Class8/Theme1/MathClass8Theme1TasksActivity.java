package com.example.schoolproj.Math.Class8.Theme1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.Math.Class7.Theme1.MathClass7Theme1TasksActivity;
import com.example.schoolproj.Math.Class7.Theme1.Var1.MathClass7Theme1TasksVar1Activity;
import com.example.schoolproj.Math.Class8.Theme1.Var1.MathClass8Theme1TasksVar1Activity;
import com.example.schoolproj.R;

public class MathClass8Theme1TasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class8_theme1_tasks);
    }

    public void onVar1MathClass71Click(View view) {
        Intent intent = new Intent(MathClass8Theme1TasksActivity.this, MathClass8Theme1TasksVar1Activity.class);
        startActivity(intent);
    }
}
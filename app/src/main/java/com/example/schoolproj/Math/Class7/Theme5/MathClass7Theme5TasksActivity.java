package com.example.schoolproj.Math.Class7.Theme5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.Math.Class7.Theme5.Var1.MathClass7Theme5TasksVar1Activity;
import com.example.schoolproj.Math.Class7.Theme5.Var2.MathClass7Theme5TasksVar2Activity;
import com.example.schoolproj.Math.Class7.Theme5.Var3.MathClass7Theme5TasksVar3Activity;
import com.example.schoolproj.R;

public class MathClass7Theme5TasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme5_tasks);
    }

    public void onVar1MathClass71Click(View view) {
        Intent intent = new Intent(MathClass7Theme5TasksActivity.this, MathClass7Theme5TasksVar1Activity.class);
        startActivity(intent);
    }

    public void onVar2MathClass71Click(View view) {
        Intent intent = new Intent(MathClass7Theme5TasksActivity.this, MathClass7Theme5TasksVar2Activity.class);
        startActivity(intent);
    }

    public void onVar3MathClass71Click(View view) {
        Intent intent = new Intent(MathClass7Theme5TasksActivity.this, MathClass7Theme5TasksVar3Activity.class);
        startActivity(intent);
    }
}
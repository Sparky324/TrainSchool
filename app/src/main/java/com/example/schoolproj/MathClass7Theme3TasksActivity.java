package com.example.schoolproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MathClass7Theme3TasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme3_tasks);
    }

    public void onVar1MathClass71Click(View view) {
        Intent intent = new Intent(MathClass7Theme3TasksActivity.this, MathClass7Theme3TasksVar1Activity.class);
        startActivity(intent);
    }

    public void onVar2MathClass71Click(View view) {
        Intent intent = new Intent(MathClass7Theme3TasksActivity.this, MathClass7Theme3TasksVar2Activity.class);
        startActivity(intent);
    }

    public void onVar3MathClass71Click(View view) {
        Intent intent = new Intent(MathClass7Theme3TasksActivity.this, MathClass7Theme3TasksVar3Activity.class);
        startActivity(intent);
    }
}
package com.example.schoolproj.Math.Class7.Theme5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.R;

public class MathClass7Theme5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme5);
    }

    public void onToTasksClick(View view) {
        Intent intent = new Intent(MathClass7Theme5Activity.this, MathClass7Theme5TasksActivity.class);
        startActivity(intent);
    }
}
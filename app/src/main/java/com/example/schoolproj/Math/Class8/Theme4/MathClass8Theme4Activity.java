package com.example.schoolproj.Math.Class8.Theme4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.Math.Class8.Theme3.MathClass8Theme3Activity;
import com.example.schoolproj.Math.Class8.Theme3.MathClass8Theme3TasksActivity;
import com.example.schoolproj.R;

public class MathClass8Theme4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class8_theme4);
    }

    public void onToTasksMath71Click(View view) {
        Intent intent = new Intent(MathClass8Theme4Activity.this, MathClass8Theme4TasksActivity.class);
        startActivity(intent);
    }
}
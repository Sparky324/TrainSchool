package com.example.schoolproj.Math.Class9.Theme3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.Math.Class9.Theme2.MathClass9Theme2Activity;
import com.example.schoolproj.Math.Class9.Theme2.MathClass9Theme2TasksActivity;
import com.example.schoolproj.R;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass9Theme3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class9_theme3);

        JLatexMathView latexMathView = findViewById(R.id.j_latex_math_view);
        latexMathView.setLatex("$$\\left\\{\\begin{array}{l}2x-1>3\\\\ 3x-2<11\\end{array}\\right.$$");
    }

    public void onToTasksMath71Click(View view) {
        Intent intent = new Intent(MathClass9Theme3Activity.this, MathClass9Theme3TasksActivity.class);
        startActivity(intent);
    }
}
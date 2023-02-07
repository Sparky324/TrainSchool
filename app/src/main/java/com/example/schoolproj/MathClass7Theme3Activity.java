package com.example.schoolproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass7Theme3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme3);

        JLatexMathView latexMathView = findViewById(R.id.j_latex_math_view12);
        latexMathView.setLatex("(4x−5)−(x+5)=2");
    }
}
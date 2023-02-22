package com.example.schoolproj.Math.Class7.Theme4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.schoolproj.R;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass7Theme4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme4);

        JLatexMathView latexMathView = findViewById(R.id.j_latex_math_view13);
        latexMathView.setLatex("$$6*13-(4/2)=76$$");

        JLatexMathView latexMathView1 = findViewById(R.id.j_latex_math_view14);
        latexMathView1.setLatex("$$5x+9=98-6x$$");

        JLatexMathView latexMathView2 = findViewById(R.id.j_latex_math_view15);
        latexMathView2.setLatex("$$ax+b=0$$");
    }
}
package com.example.schoolproj.Math.Class9.Theme2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.Math.Class9.Theme1.MathClass9Theme1Activity;
import com.example.schoolproj.Math.Class9.Theme1.MathClass9Theme1TasksActivity;
import com.example.schoolproj.R;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass9Theme2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class9_theme2);

        JLatexMathView latexMathView = findViewById(R.id.j_latex_math_view);
        latexMathView.setLatex("$${b}_{n+1}={b}_{n}*q\\hspace{0.17em}-\\hspace{0.17em}это\\hspace{0.17em}общая\\hspace{0.17em}формула\\hspace{0.17em}геометрической\\hspace{0.17em}прогрессии$$");

        JLatexMathView latexMathView1 = findViewById(R.id.j_latex_math_view1);
        latexMathView1.setLatex("$${b}_{n}={b}_{1}*{q}^{n-1}$$");

        JLatexMathView latexMathView2 = findViewById(R.id.j_latex_math_view2);
        latexMathView2.setLatex("$${S}_{n}=\\frac{{b}_{n}q-{b}_{1}}{q-1}$$");
    }

    public void onToTasksMath71Click(View view) {
        Intent intent = new Intent(MathClass9Theme2Activity.this, MathClass9Theme2TasksActivity.class);
        startActivity(intent);
    }
}
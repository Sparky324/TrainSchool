package com.example.schoolproj.Math.Class9.Theme1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.Math.Class8.Theme3.MathClass8Theme3Activity;
import com.example.schoolproj.Math.Class8.Theme3.MathClass8Theme3TasksActivity;
import com.example.schoolproj.R;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass9Theme1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class9_theme1);

        JLatexMathView latexMathView = findViewById(R.id.j_latex_math_view);
        latexMathView.setLatex("$${a}_{n+1}={a}_{n}+d\\hspace{0.17em}-\\hspace{0.17em}это\\hspace{0.17em}общая\\hspace{0.17em}формула\\hspace{0.17em}арифметической\\hspace{0.17em}прогрессии$$");

        JLatexMathView latexMathView1 = findViewById(R.id.j_latex_math_view1);
        latexMathView1.setLatex("$${a}_{n}={a}_{1}+d(n-1)$$");

        JLatexMathView latexMathView2 = findViewById(R.id.j_latex_math_view2);
        latexMathView2.setLatex("$$S=\\frac{({a}_{1}+{a}_{n})*n}{2}$$");
    }

    public void onToTasksMath71Click(View view) {
        Intent intent = new Intent(MathClass9Theme1Activity.this, MathClass9Theme1TasksActivity.class);
        startActivity(intent);
    }
}
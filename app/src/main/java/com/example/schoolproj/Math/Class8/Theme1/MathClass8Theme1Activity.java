package com.example.schoolproj.Math.Class8.Theme1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.R;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass8Theme1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class8_theme1);

        JLatexMathView latexMathView = findViewById(R.id.j_latex_math_view);
        latexMathView.setLatex("$$\\sqrt{a}=b,\\hspace{0.17em}если\\hspace{0.17em}{b}^{2}=a,\\hspace{0.17em}где\\hspace{0.17em}a\\ge 0,\\hspace{0.17em}b\\ge 0$$");

        JLatexMathView latexMathView1 = findViewById(R.id.j_latex_math_view1);
        latexMathView1.setLatex("$$\\sqrt{64}=8,\\hspace{0.17em}т.к.\\hspace{0.17em}{8}^{2}=64$$");

        JLatexMathView latexMathView2 = findViewById(R.id.j_latex_math_view2);
        latexMathView2.setLatex("$$\\sqrt{25}+\\sqrt{4}\\ne \\sqrt{29}$$");
    }

    public void onToTasksMath71Click(View view) {
        Intent intent = new Intent(MathClass8Theme1Activity.this, MathClass8Theme1TasksActivity.class);
        startActivity(intent);
    }
}
package com.example.schoolproj.Math.Class7.Theme1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schoolproj.R;

import org.scilab.forge.jlatexmath.LaTeXAtom;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass7Theme1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme1);

        JLatexMathView latexView1 = findViewById(R.id.j_latex_math_view);
        latexView1.setLatex("$$7*+8\\left)\\right)(-3+\\hspace{0.17em}-\\hspace{0.17em}это\\hspace{0.17em}не\\hspace{0.17em}математическое\\hspace{0.17em}выражение\\hspace{0.17em}\\\\(оно\\hspace{0.17em}не\\hspace{0.17em}имеет\\hspace{0.17em}смысла)$$");

        JLatexMathView latexView2 = findViewById(R.id.j_latex_math_view2);
        latexView2.setLatex("$${x}^{2}-4+2x\\hspace{0.17em}-\\hspace{0.17em}это\\hspace{0.17em}алгебраическое\\hspace{0.17em}выражение$$");

        JLatexMathView latexView3 = findViewById(R.id.j_latex_math_view3);
        latexView3.setLatex("$$a+b=b+a$$");

        JLatexMathView latexView4 = findViewById(R.id.j_latex_math_view4);
        latexView4.setLatex("$$(a+b)+c=a+(b+c)$$");

        JLatexMathView latexView5 = findViewById(R.id.j_latex_math_view5);
        latexView5.setLatex("$$a*b=b*a$$");

        JLatexMathView latexView6 = findViewById(R.id.j_latex_math_view6);
        latexView6.setLatex("$$(a* b)* c=a* (b* c)$$");

        JLatexMathView latexView7 = findViewById(R.id.j_latex_math_view7);
        latexView7.setLatex("$$(a+b)* c=ac+bc$$");

        JLatexMathView latexView8 = findViewById(R.id.j_latex_math_view8);
        latexView8.setLatex("$${5}^{2}-3*4+(9-3)=19$$");
    }

    public void onToTasksMath71Click(View view) {
        Intent intent = new Intent(MathClass7Theme1Activity.this, MathClass7Theme1TasksActivity.class);
        startActivity(intent);
    }
}
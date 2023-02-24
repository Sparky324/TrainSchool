package com.example.schoolproj.Math.Class8.Theme3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.Math.Class8.Theme2.MathClass8Theme2Activity;
import com.example.schoolproj.Math.Class8.Theme2.MathClass8Theme2TasksActivity;
import com.example.schoolproj.R;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass8Theme3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class8_theme3);

        JLatexMathView latexMathView = findViewById(R.id.j_latex_math_view);
        latexMathView.setLatex("$$(a+b{)}^{2}={a}^{2}+2ab+{b}^{2}$$");

        JLatexMathView latexMathView1 = findViewById(R.id.j_latex_math_view1);
        latexMathView1.setLatex("$$(a-b{)}^{2}={a}^{2}-2ab+{b}^{2}$$");

        JLatexMathView latexMathView2 = findViewById(R.id.j_latex_math_view2);
        latexMathView2.setLatex("$${a}^{2}-{b}^{2}=(a+b)*(a-b)$$");

        JLatexMathView latexMathView3 = findViewById(R.id.j_latex_math_view3);
        latexMathView3.setLatex("$${a}^{3}+{b}^{3}=(a+b)*({a}^{2}-ab+{b}^{2})$$");

        JLatexMathView latexMathView4 = findViewById(R.id.j_latex_math_view4);
        latexMathView4.setLatex("$${a}^{3}-{b}^{3}=(a-b)*({a}^{2}+ab+{b}^{2})$$");

        JLatexMathView latexMathView5 = findViewById(R.id.j_latex_math_view5);
        latexMathView5.setLatex("$$(a+b{)}^{3}= {a}^{3}+3{a}^{2}b+3a{b}^{2}+{b}^{3}$$");

        JLatexMathView latexMathView6 = findViewById(R.id.j_latex_math_view6);
        latexMathView6.setLatex("$$(a-b{)}^{3}={a}^{3}-3{a}^{2}b+3a{b}^{2}-{b}^{3}$$");
    }

    public void onToTasksMath71Click(View view) {
        Intent intent = new Intent(MathClass8Theme3Activity.this, MathClass8Theme3TasksActivity.class);
        startActivity(intent);
    }
}
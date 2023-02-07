package com.example.schoolproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass7Theme2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme2);

        JLatexMathView latexView = findViewById(R.id.j_latex_math_view10);
        latexView.setLatex("$$a*b=b*a$$");

        JLatexMathView latexView1 = findViewById(R.id.j_latex_math_view11);
        latexView1.setLatex("$$\\frac{a}{b}*\\frac{c}{d}=\\frac{a*c}{b*d}$$");
    }

    public void onToTasksClick(View view) {
        Intent intent = new Intent(MathClass7Theme2Activity.this, MathClass7Theme2TasksActivity.class);
        startActivity(intent);
    }
}
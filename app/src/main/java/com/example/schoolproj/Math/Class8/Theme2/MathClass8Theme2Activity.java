package com.example.schoolproj.Math.Class8.Theme2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.R;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass8Theme2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class8_theme2);

        JLatexMathView latexMathView = findViewById(R.id.j_latex_math_view);
        latexMathView.setLatex("$$\\sqrt{a}=\\left|a\\right|$$");

        JLatexMathView latexMathView1 = findViewById(R.id.j_latex_math_view1);
        latexMathView1.setLatex("$$\\sqrt{a}*\\sqrt{b}=\\sqrt{a*b}$$");

        JLatexMathView latexMathView2 = findViewById(R.id.j_latex_math_view2);
        latexMathView2.setLatex("$$\\sqrt{a*a*b}=a\\sqrt{b}$$");
    }

    public void onToTasksMath71Click(View view) {
        Intent intent = new Intent(MathClass8Theme2Activity.this, MathClass8Theme2TasksActivity.class);
        startActivity(intent);
    }
}
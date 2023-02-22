package com.example.schoolproj.Math.Class7.Theme3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolproj.R;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass7Theme3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme3);

        JLatexMathView latexMathView = findViewById(R.id.j_latex_math_view12);
        latexMathView.setLatex("(4x−5)−(x+5)=2");
    }

    public void onToTasksMath73Click(View view) {
        Intent intent = new Intent(MathClass7Theme3Activity.this, MathClass7Theme3TasksActivity.class);
        startActivity(intent);
    }
}
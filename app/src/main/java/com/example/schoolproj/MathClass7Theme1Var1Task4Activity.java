package com.example.schoolproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass7Theme1Var1Task4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme1_var1_task4);

        JLatexMathView latexMathView = findViewById(R.id.j_latex_math_view9);
        latexMathView.setLatex("$$Найди\\hspace{0.17em}значение\\hspace{0.17em}алгебраического\\hspace{0.17em}выражения$$");

        JLatexMathView latexMathView1 = findViewById(R.id.j_latex_math_view10);
        latexMathView1.setLatex("$$\\frac{6a+7b}{3a-4b},\\hspace{0.17em}если$$");

        JLatexMathView latexMathView2 = findViewById(R.id.j_latex_math_view11);
        latexMathView2.setLatex("$$a= 32,\\hspace{0.17em}b= 12.$$");

    }

    public void onAnswerClick(View view) {
        EditText editText = findViewById(R.id.answer);
        String answer = editText.getText().toString();
        if (answer.equals("5.75") || answer.equals("5,75")) {
            Toast.makeText(this, "Верно!!", Toast.LENGTH_SHORT).show();
            editText.setTextColor(Color.GREEN);
        } else {
            Toast.makeText(this, "К сожалению, неверно:(", Toast.LENGTH_SHORT).show();
            editText.setTextColor(Color.RED);
        }
    }

    public void onNextClick(View view) {
        Intent intent = new Intent(MathClass7Theme1Var1Task4Activity.this, MathClass7Theme1Var1Task5Activity.class);
        startActivity(intent);
        finish();
    }

    public void onPrevClick(View view) {
        Intent intent = new Intent(MathClass7Theme1Var1Task4Activity.this, MathClass7Theme1Var1Task3Activity.class);
        startActivity(intent);
        finish();
    }
}
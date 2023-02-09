package com.example.schoolproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass7Theme1Var1Task3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme1_var1_task3);

        JLatexMathView latexMathView = findViewById(R.id.j_latex_math_view9);
        latexMathView.setLatex("$$42,4*\\frac{5}{8}-2,4*\\frac{5}{8}$$");
    }

    public void onAnswerClick(View view) {
        EditText editText = findViewById(R.id.answer);
        String answer = editText.getText().toString();
        if (answer.equals("25") || answer.equals("25")) {
            Toast.makeText(this, "Верно!!", Toast.LENGTH_SHORT).show();
            editText.setTextColor(Color.GREEN);
        } else {
            Toast.makeText(this, "К сожалению, неверно:(", Toast.LENGTH_SHORT).show();
            editText.setTextColor(Color.RED);
        }
    }

    public void onNextClick(View view) {
        Intent intent = new Intent(MathClass7Theme1Var1Task3Activity.this, MathClass7Theme1Var1Task4Activity.class);
        startActivity(intent);
        finish();
    }

    public void onPrevClick(View view) {
        Intent intent = new Intent(MathClass7Theme1Var1Task3Activity.this, MathClass7Theme1Var1Task2Activity.class);
        startActivity(intent);
        finish();
    }
}
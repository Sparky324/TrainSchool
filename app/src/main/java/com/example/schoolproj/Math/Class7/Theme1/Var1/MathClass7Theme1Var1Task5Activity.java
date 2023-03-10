package com.example.schoolproj.Math.Class7.Theme1.Var1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.schoolproj.R;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass7Theme1Var1Task5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme1_var1_task5);

        JLatexMathView latexMathView = findViewById(R.id.j_latex_math_view9);
        latexMathView.setLatex("$$\\frac{3,8*1,43}{10+{\\displaystyle \\frac{1,6}{{\\displaystyle \\frac{3}{5}}*0,4-0,4}}}$$");
    }

    public void onAnswerClick(View view) {
        EditText editText = findViewById(R.id.answer);
        String answer = editText.getText().toString();
        if (answer.equals("0")) {
            Toast.makeText(this, "Верно!!", Toast.LENGTH_SHORT).show();
            editText.setTextColor(Color.GREEN);
        } else {
            Toast.makeText(this, "К сожалению, неверно:(", Toast.LENGTH_SHORT).show();
            editText.setTextColor(Color.RED);
        }
    }

    public void onPrevClick(View view) {
        Intent intent = new Intent(MathClass7Theme1Var1Task5Activity.this, MathClass7Theme1Var1Task4Activity.class);
        startActivity(intent);
        finish();
    }
}
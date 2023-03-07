package com.example.schoolproj.Math.Class8.Theme4.Var1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.schoolproj.R;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass8Theme4Var1Task1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class8_theme4_var1_task1);

        JLatexMathView latexMathView = findViewById(R.id.j_latex_math_view9);
        latexMathView.setLatex("$$Какое\\hspace{0.17em}из\\hspace{0.17em}чисел\\hspace{0.17em}7;\\hspace{0.17em}-7\\hspace{0.17em}и\\hspace{0.17em}0\\hspace{0.17em}является\\hspace{0.17em}решением\\hspace{0.17em}неравенства\\hspace{0.17em}7t+14>14?$$");
    }

    public void onAnswerClick(View view) {
        EditText editText = findViewById(R.id.answer);
        String answer = editText.getText().toString();
        if (answer.equals("7")) {
            Toast.makeText(this, "Верно!!", Toast.LENGTH_SHORT).show();
            editText.setTextColor(Color.GREEN);
        } else {
            Toast.makeText(this, "К сожалению, неверно:(", Toast.LENGTH_SHORT).show();
            editText.setTextColor(Color.RED);
        }
    }
}
package com.example.schoolproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ru.noties.jlatexmath.JLatexMathView;

public class MathClass7Theme3Var1Task1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme3_var1_task1);
    }

    public void onAnswerClick(View view) {
        EditText editText = findViewById(R.id.answer);
        String answer = editText.getText().toString();
        if (answer.equals("a*b=7") || answer.equals("b*a=7")) {
            Toast.makeText(this, "Верно!!", Toast.LENGTH_SHORT).show();
            editText.setTextColor(Color.GREEN);
        } else {
            Toast.makeText(this, "К сожалению, неверно:(", Toast.LENGTH_SHORT).show();
            editText.setTextColor(Color.RED);
        }
    }

    public void onNextClick(View view) {
        Intent intent = new Intent(MathClass7Theme3Var1Task1Activity.this, MathClass7Theme3Var1Task2Activity.class);
        startActivity(intent);
        finish();
    }
}
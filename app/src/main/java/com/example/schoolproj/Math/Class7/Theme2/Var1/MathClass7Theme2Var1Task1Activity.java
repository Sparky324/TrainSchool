package com.example.schoolproj.Math.Class7.Theme2.Var1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.schoolproj.Math.Class7.Theme1.Var1.MathClass7Theme1Var1Task1Activity;
import com.example.schoolproj.Math.Class7.Theme1.Var1.MathClass7Theme1Var1Task2Activity;
import com.example.schoolproj.R;

public class MathClass7Theme2Var1Task1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme2_var1_task1);
    }

    public void onAnswerClick(View view) {
        EditText editText = findViewById(R.id.answer);
        String answer = editText.getText().toString();
        if (answer.equals("k/n")) {
            Toast.makeText(this, "Верно!!", Toast.LENGTH_SHORT).show();
            editText.setTextColor(Color.GREEN);
        } else {
            Toast.makeText(this, "К сожалению, неверно:(", Toast.LENGTH_SHORT).show();
            editText.setTextColor(Color.RED);
        }
    }

    public void onNextClick(View view) {
        Intent intent = new Intent(MathClass7Theme2Var1Task1Activity.this, MathClass7Theme2Var1Task2Activity.class);
        startActivity(intent);
        finish();
    }
}
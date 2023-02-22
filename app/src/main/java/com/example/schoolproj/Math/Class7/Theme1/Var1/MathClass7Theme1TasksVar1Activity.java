package com.example.schoolproj.Math.Class7.Theme1.Var1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.schoolproj.R;

import java.util.ArrayList;

public class MathClass7Theme1TasksVar1Activity extends AppCompatActivity implements RVAdapterMath7Theme1Var1.ItemClickListener {

    RVAdapterMath7Theme1Var1 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme1_tasks_var1);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("1. Определение суммы и разности чисел");
        subjects.add("2. Выполни действия (десятичные дроби)");
        subjects.add("3. Вычисли рациональным способом");
        subjects.add("4. Значение алгебраического выражения");
        subjects.add("5. Имеет ли смысл выражение?");

        RecyclerView recyclerView = findViewById(R.id.rvMathClass7Theme1Var1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RVAdapterMath7Theme1Var1(this, subjects);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Скоро будет:)", Toast.LENGTH_SHORT).show();
    }
}
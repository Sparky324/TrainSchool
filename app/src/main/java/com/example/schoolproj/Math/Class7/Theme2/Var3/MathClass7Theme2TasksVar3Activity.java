package com.example.schoolproj.Math.Class7.Theme2.Var3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.schoolproj.R;

import java.util.ArrayList;

public class MathClass7Theme2TasksVar3Activity extends AppCompatActivity implements RVAdapterMath7Theme2Var3.ItemClickListener {

    RVAdapterMath7Theme2Var3 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme2_tasks_var3);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("1. Определение суммы и разности чисел");
        subjects.add("2. Выполни действия (десятичные дроби)");
        subjects.add("3. Вычисли рациональным способом");
        subjects.add("4. Значение алгебраического выражения");
        subjects.add("5. Имеет ли смысл выражение?");

        RecyclerView recyclerView = findViewById(R.id.rvMathClass7Theme1Var1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RVAdapterMath7Theme2Var3(this, subjects);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Скоро будет:)", Toast.LENGTH_SHORT).show();
    }
}
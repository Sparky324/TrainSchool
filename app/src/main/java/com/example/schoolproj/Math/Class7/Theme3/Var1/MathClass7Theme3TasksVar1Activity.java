package com.example.schoolproj.Math.Class7.Theme3.Var1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.schoolproj.R;

import java.util.ArrayList;

public class MathClass7Theme3TasksVar1Activity extends AppCompatActivity implements RVAdapterMath7Theme3Var1.ItemClickListener{

    RVAdapterMath7Theme3Var1 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme3_tasks_var1);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("1. Переход от словесной модели к математической");
        subjects.add("2. Текстовая задача (соотношение частей)");
        subjects.add("3. Составление математической модели со сравнением данных задач");
        subjects.add("4. Соответствие графической модели — аналитической");
        subjects.add("5. Математическая модель деления с остатком");

        RecyclerView recyclerView = findViewById(R.id.rvMathClass7Theme3Var1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RVAdapterMath7Theme3Var1(this, subjects);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Скоро будет:)", Toast.LENGTH_SHORT).show();
    }
}
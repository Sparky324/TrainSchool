package com.example.schoolproj.Math.Class7.Theme5.Var1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.schoolproj.R;

import java.util.ArrayList;

public class MathClass7Theme5TasksVar1Activity extends AppCompatActivity implements RVAdapterMath7Theme5Var1.ItemClickListener {

    RVAdapterMath7Theme5Var1 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme5_tasks_var1);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("1. Расстояние между точками на координатной прямой");
        subjects.add("2. Принадлежность точек интервалу");
        subjects.add("3. Количество целых чисел в промежутке");
        subjects.add("4. Определение точки и её окрестности");
        subjects.add("5. Координаты точек, делящие отрезок на части");

        RecyclerView recyclerView = findViewById(R.id.rvMathClass7Theme3Var1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RVAdapterMath7Theme5Var1(this, subjects);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Скоро будет:)", Toast.LENGTH_SHORT).show();
    }
}
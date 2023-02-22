package com.example.schoolproj.Math.Class7.Theme2.Var1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.schoolproj.R;

import java.util.ArrayList;

public class MathClass7Theme2TasksVar1Activity extends AppCompatActivity implements RVAdapterMath7Theme2Var1.ItemClickListener {

    RVAdapterMath7Theme2Var1 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme2_tasks_var1);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("1. Запиши на математическом языке");
        subjects.add("2. Опиши ситуацию с числами");
        subjects.add("3. Вычисление процента от числа");

        RecyclerView recyclerView = findViewById(R.id.rvMathClass7Theme1Var1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RVAdapterMath7Theme2Var1(this, subjects);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Скоро будет:)", Toast.LENGTH_SHORT).show();
    }
}
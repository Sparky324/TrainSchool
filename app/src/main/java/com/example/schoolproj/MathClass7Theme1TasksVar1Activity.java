package com.example.schoolproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MathClass7Theme1TasksVar1Activity extends AppCompatActivity implements RVAdapterMath7Theme1Var1.ItemClickListener {

    RVAdapterMath7Theme1Var1 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7_theme1_tasks_var1);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("1. Определение суммы и разности чисел");
        subjects.add("2. Задача");
        subjects.add("3. Задача");
        subjects.add("4. Задача");
        subjects.add("5. Задача");

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
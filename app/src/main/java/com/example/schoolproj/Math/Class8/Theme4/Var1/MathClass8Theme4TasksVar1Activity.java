package com.example.schoolproj.Math.Class8.Theme4.Var1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.schoolproj.Math.Class8.Theme2.Var1.RVAdapterMath8Theme2Var1;
import com.example.schoolproj.R;

import java.util.ArrayList;

public class MathClass8Theme4TasksVar1Activity extends AppCompatActivity implements RVAdapterMath8Theme4Var1.ItemClickListener {

    RVAdapterMath8Theme4Var1 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class8_theme4_tasks_var1);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("1. Решение простого неравенства");

        RecyclerView recyclerView = findViewById(R.id.rvMathClass7Theme1Var1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RVAdapterMath8Theme4Var1(this, subjects);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Скоро будет:)", Toast.LENGTH_SHORT).show();
    }
}
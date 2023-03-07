package com.example.schoolproj.Math.Class9.Theme3.Var1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.schoolproj.Math.Class9.Theme1.Var1.RVAdapterMath9Theme1Var1;
import com.example.schoolproj.R;

import java.util.ArrayList;

public class MathClass9Theme3TasksVar1Activity extends AppCompatActivity implements RVAdapterMath9Theme3Var1.ItemClickListener{

    RVAdapterMath9Theme3Var1 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class9_theme3_tasks_var1);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("1. Метод сложения (линейные уравнения)");

        RecyclerView recyclerView = findViewById(R.id.rvMathClass7Theme3Var1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RVAdapterMath9Theme3Var1(this, subjects);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Скоро будет:)", Toast.LENGTH_SHORT).show();
    }
}
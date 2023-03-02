package com.example.schoolproj.Math.Class8.Theme1.Var1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.schoolproj.Math.Class7.Theme1.Var1.RVAdapterMath7Theme1Var1;
import com.example.schoolproj.R;

import java.util.ArrayList;

public class MathClass8Theme1TasksVar1Activity extends AppCompatActivity implements RVAdapterMath8Theme1Var1.ItemClickListener{

    RVAdapterMath8Theme1Var1 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class8_theme1_tasks_var1);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("1. Определение значения выражения");

        RecyclerView recyclerView = findViewById(R.id.rvMathClass7Theme1Var1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RVAdapterMath8Theme1Var1(this, subjects);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Скоро будет:)", Toast.LENGTH_SHORT).show();
    }
}
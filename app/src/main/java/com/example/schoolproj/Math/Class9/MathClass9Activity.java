package com.example.schoolproj.Math.Class9;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schoolproj.R;

import java.util.ArrayList;

public class MathClass9Activity extends AppCompatActivity implements RVAdapterMath9.ItemClickListener{

    RVAdapterMath9 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class9);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("1. Арифметическая прогрессия");
        subjects.add("2. Геометрическая прогрессия");
        subjects.add("3. Системы рациональных неравенств");

        RecyclerView recyclerView = findViewById(R.id.Themes3);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RVAdapterMath9(this, subjects);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Скоро будет:)", Toast.LENGTH_SHORT).show();
    }
}
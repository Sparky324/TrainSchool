package com.example.schoolproj.Math.Class8;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schoolproj.R;

import java.util.ArrayList;

public class MathClass8Activity extends AppCompatActivity implements RVAdapterMath8.ItemClickListener{

    RVAdapterMath8 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class8);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("1. Квадратный корень");
        subjects.add("2. Свойства квадратного корня");
        subjects.add("3. Формулы сокращенного умножения");
        subjects.add("4. Линейные неравенства с одной переменной");

        RecyclerView recyclerView = findViewById(R.id.Themes2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RVAdapterMath8(this, subjects);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Скоро будет:)", Toast.LENGTH_SHORT).show();
    }
}
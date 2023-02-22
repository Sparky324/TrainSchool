package com.example.schoolproj.Math.Class7;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schoolproj.R;

import java.util.ArrayList;

public class MathClass7Activity extends AppCompatActivity implements RVAdapterMath7.ItemClickListener {

    RVAdapterMath7 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class7);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("1. Числовые выражения. Алгебраические выражения");
        subjects.add("2. Математический язык");
        subjects.add("3. Математические модели реальных ситуаций");
        subjects.add("4. Линейное уравнение с одной переменной. Алгоритм решения");
        subjects.add("5. Координатная прямая. Числовые промежутки");

        RecyclerView recyclerView = findViewById(R.id.Themes1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RVAdapterMath7(this, subjects);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Скоро будет:)", Toast.LENGTH_SHORT).show();
    }
}
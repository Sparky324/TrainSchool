package com.example.schoolproj;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MathClass9Activity extends AppCompatActivity implements RVAdapterMath9.ItemClickListener{

    RVAdapterMath9 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class9);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Тема 1");
        subjects.add("Тема 2");
        subjects.add("Тема 3");
        subjects.add("Тема 4");
        subjects.add("Тема 5");

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
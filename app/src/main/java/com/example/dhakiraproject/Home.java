package com.example.dhakiraproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.dhakiraproject.databinding.ActivityHomeBinding;
import com.example.dhakiraproject.thefive.ARMainActivity;
import com.example.dhakiraproject.thefive.Appointments;
import com.example.dhakiraproject.thefive.Medications;
import com.example.dhakiraproject.thefive.ProblemSolving;
import com.example.dhakiraproject.thefive.ToDoActivity;
import com.example.dhakiraproject.thefive.Tracking;

public class Home extends AppCompatActivity {
    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.dailytasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, ToDoActivity.class);
                startActivity(intent);
            }
        });
        binding.appointments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Appointments.class);
                startActivity(intent);
            }
        });

        binding.medication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Medications.class);
                startActivity(intent);
            }
        });

        binding.tracking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Tracking.class);
                startActivity(intent);
            }
        });

        binding.ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, ARMainActivity.class);
                startActivity(intent);
            }
        });

        binding.booster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, ProblemSolving.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.dhakiraproject.thefive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dhakiraproject.R;
import com.example.dhakiraproject.databinding.ActivityAppointmentsBinding;

public class Appointments extends AppCompatActivity {
    private ActivityAppointmentsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAppointmentsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(v -> finish());
    }
}
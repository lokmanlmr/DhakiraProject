package com.example.dhakiraproject.thefive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dhakiraproject.R;
import com.example.dhakiraproject.databinding.ActivityMedicationsBinding;

public class Medications extends AppCompatActivity {
    ActivityMedicationsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMedicationsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(v -> finish());

        binding.backButton2.setOnClickListener(v -> finish());
    }
}
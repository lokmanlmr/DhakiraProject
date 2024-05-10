package com.example.dhakiraproject.thefive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dhakiraproject.R;
import com.example.dhakiraproject.databinding.ActivityTrackingBinding;

public class Tracking extends AppCompatActivity {
    ActivityTrackingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTrackingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(v -> {
            finish();
        });


    }
}
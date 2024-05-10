package com.example.dhakiraproject.thefive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dhakiraproject.R;
import com.example.dhakiraproject.databinding.ActivityArmainBinding;

public class ARMainActivity extends AppCompatActivity {
    ActivityArmainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityArmainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(v -> {
            finish();
        });
    }
}
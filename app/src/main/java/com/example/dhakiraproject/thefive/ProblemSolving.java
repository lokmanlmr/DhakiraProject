package com.example.dhakiraproject.thefive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dhakiraproject.R;
import com.example.dhakiraproject.databinding.ActivityProblemSolvingBinding;

public class ProblemSolving extends AppCompatActivity {
ActivityProblemSolvingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProblemSolvingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(v -> {
            finish();
        });
    }
}
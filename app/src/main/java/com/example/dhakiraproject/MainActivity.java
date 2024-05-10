package com.example.dhakiraproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dhakiraproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.letsGetStartedLayout.setOnClickListener(v -> {
            /*
            Intent intent = new Intent(MainActivity.this, Register.class);
            startActivity(intent);
            */

        });

        binding.login.setOnClickListener(v -> {
            //Go to Login Activity
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent);
        });

    }
}
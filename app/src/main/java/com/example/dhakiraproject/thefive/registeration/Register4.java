package com.example.dhakiraproject.thefive.registeration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dhakiraproject.Login;
import com.example.dhakiraproject.R;
import com.example.dhakiraproject.databinding.ActivityRegister4Binding;

public class Register4 extends AppCompatActivity {
ActivityRegister4Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegister4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    binding.nextButton.setOnClickListener(v -> {
                //Go to Register5 Activity
                Intent intent = new Intent(Register4.this, Register5.class);
                startActivity(intent);
            });
        binding.login.setOnClickListener(v -> {
            Intent intent = new Intent(Register4.this, Login.class);
            startActivity(intent);
        });
        binding.backButton.setOnClickListener(v -> finish());
    }
}
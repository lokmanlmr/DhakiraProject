package com.example.dhakiraproject.thefive.registeration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dhakiraproject.Login;
import com.example.dhakiraproject.R;
import com.example.dhakiraproject.databinding.ActivityRegister2Binding;

public class Register2 extends AppCompatActivity {
ActivityRegister2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegister2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.nextButton.setOnClickListener(v -> {
            Intent intent = new Intent(Register2.this, Register3.class);
            startActivity(intent);
        });

        binding.login.setOnClickListener(v -> {
            Intent intent = new Intent(Register2.this, Login.class);
            startActivity(intent);
        });

        binding.backButton.setOnClickListener(v -> finish());
    }
}
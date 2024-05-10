package com.example.dhakiraproject.thefive.registeration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dhakiraproject.Login;
import com.example.dhakiraproject.R;
import com.example.dhakiraproject.databinding.ActivityRegister5Binding;

public class Register5 extends AppCompatActivity {
ActivityRegister5Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegister5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.nextButton.setOnClickListener(v -> {
            //Go to Register6 Activity
            Intent intent = new Intent(Register5.this, Register6.class);
            startActivity(intent);
        });

binding.login.setOnClickListener(v -> {
            //Go to Login Activity
            Intent intent = new Intent(Register5.this, Login.class);
            startActivity(intent);
        });
        binding.backButton.setOnClickListener(v -> finish());
    }
}
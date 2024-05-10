package com.example.dhakiraproject.thefive.registeration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dhakiraproject.Login;
import com.example.dhakiraproject.R;
import com.example.dhakiraproject.databinding.ActivityRegister6Binding;

public class Register6 extends AppCompatActivity {
ActivityRegister6Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register6);
        binding = ActivityRegister6Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.nextButton.setOnClickListener(v -> {
            //Go to Register7 Activity
            Intent intent = new Intent(Register6.this, Login.class);
            startActivity(intent);
        });
    }
}
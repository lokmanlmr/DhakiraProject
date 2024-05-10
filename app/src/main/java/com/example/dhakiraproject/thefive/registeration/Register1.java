package com.example.dhakiraproject.thefive.registeration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.widget.ArrayAdapter;

import com.example.dhakiraproject.Login;
import com.example.dhakiraproject.R;
import com.example.dhakiraproject.databinding.ActivityRegister1Binding;

public class Register1 extends AppCompatActivity {
ActivityRegister1Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegister1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.gender_options, R.layout.spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
       binding.genderSpinner.setAdapter(adapter);

       binding.nextButton.setOnClickListener(v -> {
           Intent intent = new Intent(Register1.this, Register2.class);
           startActivity(intent);

       });

       binding.login.setOnClickListener(v -> {
           Intent intent = new Intent(Register1.this, Login.class);
           startActivity(intent);

       });


    }

}
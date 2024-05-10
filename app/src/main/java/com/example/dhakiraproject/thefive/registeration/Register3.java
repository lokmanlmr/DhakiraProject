package com.example.dhakiraproject.thefive.registeration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.dhakiraproject.Home;
import com.example.dhakiraproject.Login;
import com.example.dhakiraproject.R;
import com.example.dhakiraproject.databinding.ActivityRegister3Binding;
import com.example.dhakiraproject.loginfragments.PersonalWithSensor;

import java.util.concurrent.Executor;

public class Register3 extends AppCompatActivity {
ActivityRegister3Binding binding;
    private Executor executor;
    private BiometricPrompt biometricPrompt;
    private BiometricPrompt.PromptInfo promptInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegister3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        executor = ContextCompat.getMainExecutor(Register3.this);
        biometricPrompt = new BiometricPrompt(Register3.this,
                executor, new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int errorCode,
                                              @NonNull CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);
                Toast.makeText(Register3.this,
                                "Authentication error: " + errString, Toast.LENGTH_SHORT)
                        .show();
            }

            @Override
            public void onAuthenticationSucceeded(
                    @NonNull BiometricPrompt.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);
                Toast.makeText(Register3.this,
                        "Authentication succeeded!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Register3.this, Register4.class);
                startActivity(intent);
            }

            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
                Toast.makeText(Register3.this, "Authentication failed",
                                Toast.LENGTH_SHORT)
                        .show();
            }
        });

        promptInfo = new BiometricPrompt.PromptInfo.Builder()
                .setTitle("Biometric login for my app")
                .setSubtitle("Log in using your biometric credential")
                .setNegativeButtonText("Cancel")
                .build();

        // Prompt appears when user clicks "Log in".
        // Consider integrating with the keystore to unlock cryptographic operations,
        // if needed by your app.
        binding.fingerprintIcon.setOnClickListener(view -> {
            biometricPrompt.authenticate(promptInfo);
        });

        binding.login.setOnClickListener(v -> {
            Intent intent = new Intent(Register3.this, Login.class);
            startActivity(intent);
        });

        binding.nextButton.setOnClickListener(v -> {
            Intent intent = new Intent(Register3.this, Register4.class);
            startActivity(intent);
        });
        binding.backButton.setOnClickListener(v -> finish());
    }
}
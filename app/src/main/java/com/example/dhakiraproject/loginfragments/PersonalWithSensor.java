package com.example.dhakiraproject.loginfragments;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.dhakiraproject.Home;
import com.example.dhakiraproject.Login;
import com.example.dhakiraproject.databinding.FragmentPersonalWithSensorBinding;

import java.util.concurrent.Executor;


public class PersonalWithSensor extends Fragment {

    FragmentPersonalWithSensorBinding binding;
    private Executor executor;
    private BiometricPrompt biometricPrompt;
    private BiometricPrompt.PromptInfo promptInfo;

    public PersonalWithSensor() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentPersonalWithSensorBinding.inflate(inflater,container,false);

        binding.clickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Login) requireActivity()).getViewPagerAdapter().useSensorFragment(false);
            }
        });

        executor = ContextCompat.getMainExecutor(requireContext());
        biometricPrompt = new BiometricPrompt(PersonalWithSensor.this,
                executor, new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int errorCode,
                                              @NonNull CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);
                Toast.makeText(requireContext(),
                                "Authentication error: " + errString, Toast.LENGTH_SHORT)
                        .show();
            }

            @Override
            public void onAuthenticationSucceeded(
                    @NonNull BiometricPrompt.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);
                Toast.makeText(requireContext(),
                        "Authentication succeeded!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Home.class);
                startActivity(intent);
            }

            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
                Toast.makeText(requireContext(), "Authentication failed",
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

        return binding.getRoot();
    }
}
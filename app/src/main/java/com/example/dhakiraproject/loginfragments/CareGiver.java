package com.example.dhakiraproject.loginfragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dhakiraproject.Home;
import com.example.dhakiraproject.R;
import com.example.dhakiraproject.databinding.FragmentCareGiverBinding;


public class CareGiver extends Fragment {
    FragmentCareGiverBinding binding;

    public CareGiver() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCareGiverBinding.inflate(inflater, container, false);
        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Home.class);
                startActivity(intent);
            }
        });


        return binding.getRoot();
    }
}
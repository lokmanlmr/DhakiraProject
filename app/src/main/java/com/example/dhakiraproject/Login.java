package com.example.dhakiraproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.dhakiraproject.databinding.ActivityLoginBinding;
import com.example.dhakiraproject.loginfragments.CareGiver;
import com.example.dhakiraproject.loginfragments.Doctor;
import com.example.dhakiraproject.loginfragments.PersonalWithSensor;
import com.example.dhakiraproject.loginfragments.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Login extends AppCompatActivity {
    ActivityLoginBinding binding;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Set up the ViewPager2 with the adapter
        viewPagerAdapter = new ViewPagerAdapter(this);
        binding.viewPager.setAdapter(viewPagerAdapter);

        // Set up the TabLayout with the ViewPager2
        new TabLayoutMediator(binding.tabLayout, binding.viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("Doctor");
                            break;
                        case 1:
                            tab.setText("Personal");
                            break;
                        case 2:
                            tab.setText("Caregiver");
                            break;
                    }
                }).attach();

        // Set the default tab to 'Personal'
        TabLayout.Tab defaultTab = binding.tabLayout.getTabAt(1);
        if (defaultTab != null) {
            defaultTab.select();
        }

    }
    public ViewPagerAdapter getViewPagerAdapter() {
        return viewPagerAdapter;
    }




}
package com.example.dhakiraproject.thefive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dhakiraproject.databinding.ActivityToDoBinding;
import com.example.dhakiraproject.databinding.FragmentToDoBinding;
import com.example.dhakiraproject.thefive.todofragments.ViewPagerAdapterToDo;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ToDoActivity extends AppCompatActivity {
    ActivityToDoBinding binding;
    private ViewPagerAdapterToDo viewPagerAdapterToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityToDoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(v -> finish());

        viewPagerAdapterToDo = new ViewPagerAdapterToDo(this);
        binding.viewPager.setAdapter(viewPagerAdapterToDo);

        // Set up the TabLayout with the ViewPager2
        new TabLayoutMediator(binding.tabLayout, binding.viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("Pending");
                            break;
                        case 1:
                            tab.setText("To-Do");
                            break;
                        case 2:
                            tab.setText("Done");
                            break;
                    }
                }).attach();

        // Set the default tab to 'To-Do'
        TabLayout.Tab defaultTab = binding.tabLayout.getTabAt(1);
        if (defaultTab != null) {
            defaultTab.select();
        }

    }
}
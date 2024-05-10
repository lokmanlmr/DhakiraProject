package com.example.dhakiraproject.thefive.todofragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class ViewPagerAdapterToDo extends FragmentStateAdapter {
    public ViewPagerAdapterToDo(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new PendingFragment();
            case 1:
                return new ToDoFragment();
            case 2:
                return new DoneFragment();
        }
        return new ToDoFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

package com.example.dhakiraproject.loginfragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private boolean useSensorFragment = true;
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public void useSensorFragment(boolean useSensorFragment) {
        this.useSensorFragment = useSensorFragment;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Doctor();
            case 1:
                return useSensorFragment ? new PersonalWithSensor() : new PersonalOnly();
            case 2:
                return new CareGiver();
            default:
                return useSensorFragment ? new PersonalWithSensor() : new PersonalOnly();
        }
    }
    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public long getItemId(int position) {
        if (position == 1) {
            return useSensorFragment ? 10 : 20;
        }
        return position;
    }

    @Override
    public boolean containsItem(long itemId) {
        if (itemId == 10 || itemId == 20) {
            return true;
        }
        return super.containsItem(itemId);
    }


}
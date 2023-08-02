package com.example.lab4_ph43159;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterViewPager2 extends FragmentStateAdapter {

    public AdapterViewPager2(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0){
            return new FragmentImage();
        }
        return new FragmentText();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

package com.example.android.tourguideappudacity;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new placesFragment();
        } else if (position == 1) {
            return new outletsFragment();
        } else if (position == 2){
            return new marketsFragment();
        } else {
            return new hospitalFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_places);
        } else if (position == 1) {
            return context.getString(R.string.category_outlets);
        } else if (position == 2) {
            return context.getString(R.string.category_markets);
        } else {
            return context.getString(R.string.category_hospital);
        }
    }
}

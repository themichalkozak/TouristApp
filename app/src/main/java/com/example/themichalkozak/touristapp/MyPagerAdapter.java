package com.example.themichalkozak.touristapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.themichalkozak.touristapp.dummy.Fragments.AtractionFragment;
import com.example.themichalkozak.touristapp.dummy.Fragments.HistoricalFragment;
import com.example.themichalkozak.touristapp.dummy.Fragments.HotelFragment;
import com.example.themichalkozak.touristapp.dummy.Fragments.RestaurantFragment;

/**
 * Created by themichalkozak on 09/05/2018.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    private String tabTitles[] = new String[] { "Atraction", "Monument", "Hotel","Restaurant" };

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return AtractionFragment.newInstance();
            case 1:
                return HistoricalFragment.newInstance();
            case 2:
                return HotelFragment.newInstance();
            case 3:
                return RestaurantFragment.newInstance();
            default:
                return null;
        }
    }

    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }
}

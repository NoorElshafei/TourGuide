package com.example.tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourGuideViewPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public TourGuideViewPagerAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Attraction);
        } else if (position == 1) {
            return mContext.getString(R.string.Public_Place);
        } else {
            return mContext.getString(R.string.Restaurants);
        }
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new AttractionFragment();
        } else if (i == 1) {
            return new PublicPlacesFragment();
        } else {
            return new RestaurantsFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}

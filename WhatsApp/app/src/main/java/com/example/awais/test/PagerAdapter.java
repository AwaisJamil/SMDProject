package com.example.awais.test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Awais on 11/19/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{
    int noOfTabs;
    public PagerAdapter(FragmentManager fragmentManager,int numberOfTabs){
        super(fragmentManager);
        this.noOfTabs=numberOfTabs;

    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                CHATS chats=new CHATS();
                return chats;
            case 1:
                CONTACTS contacts=new CONTACTS();
                return contacts;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}

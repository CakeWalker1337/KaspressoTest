package com.tenxgames.kaspressotest

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.lang.Exception


class PagerAdapter(fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment =
            when (position) {
                0 -> FirstFragment()
                1 -> SecondFragment()
                else -> throw Exception("Wrong position of selected item")
            }


    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }
}
package com.example.fragmentpractice_20200604.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.fragmentpractice_20200604.fragments.FirstFragment
import com.example.fragmentpractice_20200604.fragments.SecondFragment
import com.example.fragmentpractice_20200604.fragments.ThirdFragment

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return FirstFragment()
        } else if (position == 1) {
            return SecondFragment()
        } else {
            return ThirdFragment()

        }
    }

    override fun getCount(): Int {
    return 0
    }


}
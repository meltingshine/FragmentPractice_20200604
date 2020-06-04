package com.example.fragmentpractice_20200604

import android.os.Bundle
import com.example.fragmentpractice_20200604.Adapters.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_my_view_pager.*

class MyViewPagerActivity : BaseActivity() {

    lateinit var myPagerAdapter : MyPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_view_pager)
        setValues()
        setupEvents()
    }

    override fun setValues() {
        myPagerAdapter = MyPagerAdapter(supportFragmentManager)
        myViewPager.adapter = myPagerAdapter
    }

    override fun setupEvents() {

    }


}

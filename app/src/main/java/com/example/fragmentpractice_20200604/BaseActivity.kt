package com.example.fragmentpractice_20200604

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity:AppCompatActivity() {
    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()


}
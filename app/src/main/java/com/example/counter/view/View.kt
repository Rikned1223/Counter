package com.example.counter.view

import android.graphics.drawable.ColorDrawable

interface View {
    fun changeCount(count : Int)
    fun showToast()
    fun color(color:Int)
}
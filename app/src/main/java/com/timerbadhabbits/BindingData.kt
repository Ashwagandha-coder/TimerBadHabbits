package com.timerbadhabbits

import android.content.Context
import com.timerbadhabbits.databinding.ActivityMainBinding


class BindingData(private val context: Context, private val binding: ActivityMainBinding) {

    fun action() {

        val sharedPref = context.getSharedPreferences("main",Context.MODE_PRIVATE)

    }


}
package com.timerbadhabbits

import android.content.Context
import com.timerbadhabbits.databinding.ActivityMainBinding


class BindingData(private val binding: ActivityMainBinding) {

    fun action(context: Context) {

        val sharedPref = context.getSharedPreferences("main",Context.MODE_PRIVATE)
        val time = sharedPref.getLong("time",-1)

        if (time == 1L) {
            sharedPref.edit().putLong("time",System.currentTimeMillis()).apply()
            binding
        }

    }


}
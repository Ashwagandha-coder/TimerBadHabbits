package com.timerbadhabbits

import android.content.Context
import android.content.SharedPreferences
import com.timerbadhabbits.databinding.ActivityMainBinding


class BindingData(private val binding: ActivityMainBinding) {

    fun action(context: Context) {

        val sharedPref = initSharedPref(context)
        val time = sharedPref.getLong("time",-1)

        if (time == -1L) {
            sharedPref.edit().putLong("time",System.currentTimeMillis()).apply()
            binding.tvNumberText.text = "0"
        }
        else {

        }

    }

    private fun initSharedPref(context: Context): SharedPreferences = context.getSharedPreferences("main",Context.MODE_PRIVATE)




}
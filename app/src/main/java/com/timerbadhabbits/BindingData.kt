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

            binding.tvNumberText.text = paymentTime(time).toString()

        }

    }

    private fun paymentTime(time: Long): Long {

        val diff = System.currentTimeMillis() - time/1000
        val days = diff / (24 * 3600)
        return days

    }

    private fun initSharedPref(context: Context): SharedPreferences = context.getSharedPreferences("main",Context.MODE_PRIVATE)




}
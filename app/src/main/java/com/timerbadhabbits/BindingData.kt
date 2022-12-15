package com.timerbadhabbits

import android.content.Context
import com.timerbadhabbits.databinding.ActivityMainBinding


class BindingData(private val binding: ActivityMainBinding) {

    fun action(context: Context) {

        val sharedPref = context.getSharedPreferences("main",Context.MODE_PRIVATE)
        val time = sharedPref.getLong("time",-1)

        if (time == -1L) {
            sharedPref.edit().putLong("time",System.currentTimeMillis()).apply()
            binding.tvNumberText.text = "0"
        }
        else {

            binding.tvNumberText.text = paymentTime(time).toString()

        }

        TODO("Добавить кнопку")

    }

    private fun paymentTime(time: Long): Long {

        val diff = (System.currentTimeMillis() - time) / 1000
        return diff / (24 * 3600)

    }

//    private fun initSharedPref(context: Context): SharedPreferences = context.getSharedPreferences("main",Context.MODE_PRIVATE)




}
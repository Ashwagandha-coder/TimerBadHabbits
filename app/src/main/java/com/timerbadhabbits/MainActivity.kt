package com.timerbadhabbits

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.timerbadhabbits.databinding.ActivityMainBinding

/**
 * Главный Экран
 */

class MainActivity : AppCompatActivity() {

    private val binding by lazy { initBinding() }
    private val bindingData by lazy { initBindingData() }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        bindingData.action(baseContext)
    }


    private fun initBinding() = ActivityMainBinding.inflate(layoutInflater)
    private fun initBindingData() = BindingData(binding)




}
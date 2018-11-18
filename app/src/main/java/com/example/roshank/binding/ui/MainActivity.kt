package com.example.roshank.binding.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

import com.example.roshank.binding.R
import com.example.roshank.binding.databinding.ActivityMainBinding
import com.example.roshank.binding.model.Temperature

class MainActivity : AppCompatActivity(), MainActivityContract.View {

    internal var presenter: MainActivityPresenter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        presenter = MainActivityPresenter(this, this)
        val temperature = Temperature("It is absolutely freezing", "-20.0 c", null)
        binding.temp = temperature
        binding.presenter = presenter

    }

    override fun showData(temperature: Temperature) {
        val celsius = temperature.getCelsius()
        Toast.makeText(this, celsius, Toast.LENGTH_SHORT).show()
    }
}

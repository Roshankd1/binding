package com.example.roshank.binding.ui

import android.content.Context
import android.content.Intent

import com.example.roshank.binding.model.Temperature
import com.example.roshank.binding.ui.MainActivityContract

class MainActivityPresenter(private val view: MainActivityContract.View, private val ctx: Context) : MainActivityContract.Presenter {

    override fun onShowData(temperature: Temperature) {
        view.showData(temperature)
    }

    override fun showList() {
        val i = Intent(ctx, SecondActivity::class.java)
        ctx.startActivity(i)
    }


}

package com.example.roshank.binding.ui

import com.example.roshank.binding.model.Temperature

interface MainActivityContract {
    interface Presenter {
        fun onShowData(temperature: Temperature)
        fun showList()
    }

    interface View {
        fun showData(temperature: Temperature)
    }
}

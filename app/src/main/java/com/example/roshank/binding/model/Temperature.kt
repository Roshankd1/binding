package com.example.roshank.binding.model

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.BindingAdapter
import android.widget.ImageView

import com.bumptech.glide.Glide
import com.example.roshank.binding.BR

class Temperature(private var location: String?, private var celsius: String?, private var url: String?) : BaseObservable() {

    @Bindable
    fun getLocation(): String? {
        return location
    }

    fun setLocation(location: String) {
        this.location = location
        notifyPropertyChanged(BR.location)
    }

    @Bindable
    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
        notifyPropertyChanged(BR.url)

    }

    @Bindable
    fun getCelsius(): String? {
        return celsius
    }

    fun setCelsius(celsius: String) {
        this.celsius = celsius
        notifyPropertyChanged(BR.celsius)
    }

    companion object {

        @BindingAdapter("android:src")
        fun setImageUrl(view: ImageView, url: String) {
            Glide.with(view.context).load(url).into(view)
        }
    }
}

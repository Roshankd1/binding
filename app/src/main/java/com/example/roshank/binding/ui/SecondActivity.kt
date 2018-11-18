package com.example.roshank.binding.ui

import android.app.Activity
import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.example.roshank.binding.R
import com.example.roshank.binding.adapter.MyAdapter
import java.util.Arrays.asList
import android.support.v7.widget.LinearLayoutManager
import android.widget.ImageView
import com.example.roshank.binding.model.Temperature
import java.util.*


class SecondActivity : Activity() {
    private var recyclerView: RecyclerView? = null
    private var mAdapter: RecyclerView.Adapter<*>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var list: List<Temperature>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        list = listOf(Temperature("Hamburg", "5","http://lorempixel.com/40/40/"),
                Temperature("Berlin", "6","http://lorempixel.com/40/40/"))
        recyclerView = findViewById(R.id.my_recycler_view)
        recyclerView?.setHasFixedSize(true)

        // use a linear layout manager
        layoutManager = LinearLayoutManager(this)
        recyclerView?.layoutManager = layoutManager


        // define an adapter
        mAdapter = MyAdapter(list!!)
        recyclerView?.adapter = mAdapter

    }
}

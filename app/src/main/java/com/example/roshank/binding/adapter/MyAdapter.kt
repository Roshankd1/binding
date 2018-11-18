package com.example.roshank.binding.adapter

import com.example.roshank.binding.R
import com.example.roshank.binding.model.Temperature

class MyAdapter
// Provide a suitable constructor (depends on the kind of dataset)

(internal var data: List<Temperature>) : MyBaseAdapter(data) {

    override fun getDataAtPosition(position: Int): Any {
        return data[position]
    }

    override fun getLayoutIdForType(viewType: Int): Int {
        return R.layout.row_layout
    }

    override fun getItemCount(): Int {
        return data.size
    }

}

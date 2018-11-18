package com.example.roshank.binding.adapter

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.roshank.binding.BR
import com.example.roshank.binding.R
import com.example.roshank.binding.model.Temperature

abstract class MyBaseAdapter// Provide a suitable constructor (depends on the kind of dataset)
(private val data: List<Temperature>) : RecyclerView.Adapter<MyBaseAdapter.MyViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    inner class MyViewHolder(// each data item is just a string in this case
            private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(obj: Any) {
            binding.setVariable(BR.obj, obj)
            binding.executePendingBindings()

        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // create a new view
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.row_layout, parent, false)
        // set the view's size, margins, paddings and layout parameters
        return MyViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val temperatureData = data[position]
        holder.bind(temperatureData)

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {
        return data.size
    }

    abstract fun getDataAtPosition(position: Int): Any

    abstract fun getLayoutIdForType(viewType: Int): Int


}

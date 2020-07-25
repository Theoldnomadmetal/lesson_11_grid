package com.example.lesson11

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LinearRecAdapter(private val array:ArrayList<String>):RecyclerView.Adapter<LinearViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinearViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.linear_view_layout,parent,false)
        val linearHolder = LinearViewHolder(view)
        return linearHolder

    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: LinearViewHolder, position: Int) {
        val item = array[position]

        holder.bind(item)
    }
}
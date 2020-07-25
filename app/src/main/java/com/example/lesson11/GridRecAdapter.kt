package com.example.lesson11

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class GridRecAdapter(private val array:ArrayList<String>): RecyclerView.Adapter<GridViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_view_layout,parent,false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val item = array[position]

        holder.bind(item)
    }
}
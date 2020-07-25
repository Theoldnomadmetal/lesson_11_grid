package com.example.lesson11

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.grid_view_layout.view.*
import kotlinx.android.synthetic.main.linear_view_layout.view.*

class GridViewHolder(view:View):RecyclerView.ViewHolder(view) {
    fun bind(item: String) {
        itemView.tvCat.text = item
}
}

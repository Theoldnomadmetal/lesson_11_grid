package com.example.lesson11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GridLayoutActivity : AppCompatActivity() {

    var tvCat: TextView? = null
    var gridRecycle: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)
        setViews()
        val list = arrayListOf<String>()
        list.add("Cat")
        list.add("Cat2")
        list.add("Cat3")
        list.add("Cat4")
        list.add("Cat5")
        list.add("Cat7")
        list.add("Cat8")
        list.add("Cat9")
        list.add("Cat10")
        list.add("Cat11")
        list.add("Cat12")
        list.add("Cat13")
        list.add("Cat14")
        list.add("Cat15")



        val adapter =GridRecAdapter(list)

        gridRecycle?.layoutManager = GridLayoutManager(applicationContext, 3)
        gridRecycle?.adapter = adapter

    }
    private fun setViews(){
        tvCat = findViewById(R.id.tvCat)
        gridRecycle = findViewById(R.id.grid_recycle)
    }


}

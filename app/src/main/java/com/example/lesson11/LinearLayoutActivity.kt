package com.example.lesson11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class LinearLayoutActivity : AppCompatActivity() {
    var linearRec: RecyclerView? = null
    var tvLinear: TextView? = null
    var btnReturn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)
        setView()
        btnReturn?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val list = arrayListOf<String>()
        list.add("Doge1")
        list.add("Doge2")
        list.add("Doge3")
        list.add("Doge4")
        list.add("Doge5")
        list.add("Doge6")
        list.add("Doge7")
        list.add("Doge8")
        list.add("Doge9")


        val adapter = LinearRecAdapter(list)
        linearRec?.adapter = adapter
    }
    private fun setView(){
        linearRec = findViewById(R.id.recylce_vertical)
        tvLinear = findViewById(R.id.linear_tv)
        btnReturn = findViewById(R.id.btnReturn)


    }
}
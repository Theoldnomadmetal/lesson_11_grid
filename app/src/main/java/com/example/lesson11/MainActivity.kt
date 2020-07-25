package com.example.lesson11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    private var spinner:Spinner? = null
    private var btngo: Button? = null
    private var Position: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViews()
        setupAdapters()
        onItemSelected()
        setupListeners()
    }

    private fun setViews(){
        spinner = findViewById(R.id.spinner1)
        btngo = findViewById(R.id.btnGo)
    }

    private fun setupAdapters(){
        val adapter = SpinnerAdapter(applicationContext,R.id.tvTitle, getData())
        spinner?.adapter = adapter

    }

    private fun getData():ArrayList<DataClass> {
        val data = arrayListOf<DataClass>()
        data.add(DataClass(0,"Linear"))
        data.add(DataClass(1,"Grid"))

        return data
    }

    private fun setupListeners(){
        btngo?.setOnClickListener {startActivity()
            }
        }
    private fun onItemSelected(){
        spinner?.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?,
                                        position: Int, id: Long) {
                Position = position
            }

        }
    }
    private fun startActivity() {
        when (Position) {
            0 -> startActivity(Intent(this,LinearLayoutActivity::class.java))
            1 -> startActivity(Intent(this,GridLayoutActivity::class.java))

        }
    }
}












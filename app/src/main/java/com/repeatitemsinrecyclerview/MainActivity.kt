package com.repeatitemsinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.repeatitemsinrecyclerview.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding
private lateinit var days : ArrayList<String>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initializeData()
        initView()
    }

    private fun initView(){
        val linearLayoutManager = LinearLayoutManager(this)
        val daysAdapter = DaysAdapter(days)
        binding.rvDays.layoutManager = linearLayoutManager
        binding.rvDays.adapter = daysAdapter
    }

    private fun initializeData(){
        days = ArrayList()
        days.add("Sunday")
        days.add("Monday")
        days.add("Tuesday")
        days.add("Wednesday")
        days.add("Thursday")
        days.add("Friday")
        days.add("Saturday")
    }
}
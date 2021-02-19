package com.repeatitemsinrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repeatitemsinrecyclerview.databinding.ItemBinding

/**
 * <h1>DaysAdapter</h1>
 * <p>DaysAdapter class is used to display list days repetitively </p>
 *
 */
class DaysAdapter(private var days : ArrayList<String>) : RecyclerView.Adapter<DaysAdapter.DaysViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DaysViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DaysViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return Int.MAX_VALUE
    }

    override fun onBindViewHolder(holder: DaysViewHolder, position: Int) {
        holder.binding.tvDayName.text = days[position%days.size]
    }


    // ViewHolder Class
    class DaysViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root)
}
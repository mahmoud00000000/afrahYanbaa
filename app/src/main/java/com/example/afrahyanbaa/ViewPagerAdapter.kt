package com.example.afrahyanbaa

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.afrahyanbaa.databinding.ListViewpagerItemBinding


class ViewPagerAdapter(private val items: List<Int>) : RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    class ViewHolder(var binding: ListViewpagerItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListViewpagerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.image.setImageResource(position)
        holder.binding.blackImage.setImageResource(position)
        holder.binding.yellowImage.setImageResource(position)
        holder.binding.textPager.text = items[position].toString()
        holder.binding.imageIcon.setImageResource(position)

    }

    override fun getItemCount(): Int = items.size
}

package com.example.lessons.fashion

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.lessons.databinding.ItemFashionViewPagerBinding

class SimpleTaskAdapter( private val dataList:List<FashionDataClass>):RecyclerView.Adapter<SimpleTaskAdapter.SimpleViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SimpleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemFashionViewPagerBinding.inflate(inflater, parent, false)
        return SimpleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class SimpleViewHolder(private val binding:ItemFashionViewPagerBinding):ViewHolder(binding.root) {
        fun bind(data: FashionDataClass) {
            binding.fashionImage.setImageResource(data.image)
            binding.nametext.text=data.name
            binding.pricetext.text= data.price.toString()
        }

    }
}
package com.example.lessons.fashionPractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.lessons.databinding.ItemPagerBinding

class FashionAdapter(private val dataList:List<FashionDataClass>) :RecyclerView.Adapter<FashionAdapter.FashionViewHolder>(){

    private var binding:ItemPagerBinding?=null

    class FashionViewHolder(private val binding:ItemPagerBinding) :ViewHolder(binding.root) {
        fun bind(data:FashionDataClass){
            binding.fashionTextViewItem.text=data.surname
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FashionViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        binding=ItemPagerBinding.inflate(inflater,parent,false)
        return FashionViewHolder(binding!!)

    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: FashionViewHolder, position: Int) {
        holder.bind(dataList[position])
    }
}
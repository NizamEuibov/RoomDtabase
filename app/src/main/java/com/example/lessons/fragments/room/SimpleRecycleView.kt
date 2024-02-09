package com.example.lessons.fragments.room

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.lessons.databinding.SimpleRecyclerViewLayoutBinding

class SimpleRecycleView:RecyclerView.Adapter<SimpleRecycleView.SimpleViewHolder>() {
  private val dataList= mutableListOf<RegistrationEntity>()

    fun updateData(newList:List<RegistrationEntity>){
        dataList.clear()
        dataList.addAll(newList)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SimpleViewHolder {
        val binding=SimpleRecyclerViewLayoutBinding.
        inflate(LayoutInflater.from(parent.context),
            parent,false)
        return SimpleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SimpleRecycleView.SimpleViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int {
       return dataList.size
    }


    class SimpleViewHolder(val binding:SimpleRecyclerViewLayoutBinding):ViewHolder(binding.root) {

        fun bind(data:RegistrationEntity){
            binding.textRegistration.text=data.email
            binding.text1Registration.text=data.password
        }

    }
}
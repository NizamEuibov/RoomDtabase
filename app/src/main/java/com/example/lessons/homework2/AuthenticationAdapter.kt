package com.example.lessons.homework2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.lessons.databinding.ItemListAdapterBinding

class AuthenticationAdapter(private val emailList: MutableList<DataClass>):RecyclerView.Adapter<AuthenticationAdapter.DataViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AuthenticationAdapter.DataViewHolder {
        val binding=ItemListAdapterBinding.inflate(LayoutInflater.from(parent.context),parent,false)
      return DataViewHolder(binding)
    }


    fun addNotes(newList: List<DataClass>){
        emailList.clear()
        emailList.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: AuthenticationAdapter.DataViewHolder, position: Int) {
        holder.bind(emailList[position])
    }

    override fun getItemCount(): Int {
       return emailList.size
    }


    class DataViewHolder(private var binding:ItemListAdapterBinding):ViewHolder(binding.root) {

        fun bind(data:DataClass){
            binding.text1.text=data.email
        }

    }

}
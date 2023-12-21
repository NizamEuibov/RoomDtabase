package com.example.lessons.fashion


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.lessons.databinding.ActivityFirstUiBinding



class TaskFashionAdapter(private val dataList:List<TaskPageModel>):RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return when(viewType){
            WOMEN ->{
                val binding=ActivityFirstUiBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                WomenTaskViewholder(binding)
            }
            MEN ->{
                val binding=ActivityFirstUiBinding.inflate(LayoutInflater.from(parent.context),parent,false)
              MenTaskViewholder(binding)
            }
            else ->{
                val binding=ActivityFirstUiBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                CoupleTaskViewholder(binding)
            }
        }
//        val binding =
//            ReycylerViewLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return WomenTaskViewholder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when (holder) {
            is WomenTaskViewholder -> {
                holder.bind(dataList[position] as TaskPageModel.Women)
            }
        }
        when (holder) {
            is MenTaskViewholder -> {
                holder.bind(dataList[position] as TaskPageModel.Men)
            }
        }
        when (holder) {
            is CoupleTaskViewholder -> {
                holder.bind(dataList[position] as TaskPageModel.Couple)
            }
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun getItemViewType(position: Int): Int {
        return when(dataList[position]){
            is TaskPageModel.Women -> WOMEN
            is TaskPageModel.Men -> MEN
            is TaskPageModel.Couple -> COUPLE
        }
    }


    class WomenTaskViewholder(private val binding: ActivityFirstUiBinding) :
        ViewHolder(binding.root) {
        fun bind(data: TaskPageModel.Women) {
            val linearLayout=LinearLayoutManager(
                binding.root.context,
                LinearLayoutManager.HORIZONTAL,
                false


            )
            binding.firstReycylerView.adapter= SimpleTaskAdapter(data.list)
            binding.firstReycylerView.layoutManager=linearLayout



        }
    }

    class MenTaskViewholder(private val binding: ActivityFirstUiBinding) :
        ViewHolder(binding.root) {
        fun bind(data: TaskPageModel.Men) {
            binding.firstReycylerView.adapter= SimpleTaskAdapter(data.list)
            binding.firstReycylerView.layoutManager=LinearLayoutManager(binding.root.context)

        }
    }

    class CoupleTaskViewholder(private val binding: ActivityFirstUiBinding) :
        ViewHolder(binding.root) {
        fun bind(data: TaskPageModel.Couple) {
            binding.firstReycylerView.adapter= SimpleTaskAdapter(data.list)
            binding.firstReycylerView.layoutManager=LinearLayoutManager(binding.root.context)

        }
    }

    companion object {
        private const val WOMEN=1
        private const val MEN=2
        private const val COUPLE=3
    }
}
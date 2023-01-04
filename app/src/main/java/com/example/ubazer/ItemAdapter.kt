package com.example.ubazer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.ubazer.databinding.ItemRowBinding

class ItemAdapter (val callback :(Item)->Unit)
    : ListAdapter<Item,ItemAdapter.ItemViewHolder>(ItemDifutil()){
    class ItemViewHolder(val binding: ItemRowBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item: Item){
            binding.item=item
        }
    }
    class ItemDifutil:DiffUtil.ItemCallback<Item>(){
        override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem.id== newItem.id
        }

        override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding=
            ItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item=getItem(position)
        holder.bind(item)
        holder.itemView.setOnClickListener {
            callback(item)
        }
    }
}
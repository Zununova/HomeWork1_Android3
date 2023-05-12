package com.example.homework1_android3.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework1_android3.databinding.OneItemBinding
import com.example.homework1_android3.ui.models.Model

class StoryAdapter(private val onItemClick: (model: Model) -> Unit) :
    RecyclerView.Adapter<StoryAdapter.StoryViewHolder>() {

    private var list: List<Model> = ArrayList()

    @SuppressLint("NotifyDataSetChanged")
    fun setText(list: List<Model>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class StoryViewHolder(private val binding: OneItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener() {
                onItemClick(list[adapterPosition])
            }
        }

        fun onBind(item: Model) {
            binding.textView.text = item.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        return StoryViewHolder(
            OneItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}
package com.kingtech.intime.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kingtech.intime.R
import com.kingtech.intime.data.Task
import com.kingtech.intime.databinding.ItemContainerTaskBinding
import kotlinx.android.synthetic.main.item_container_task.view.*

class TaskAdapter(val listTask: List<Task>) : RecyclerView.Adapter<TaskAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_container_task,
            parent,
            false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tvTitleTask.text = listTask[position].title
    }

    override fun getItemCount(): Int {
        return listTask.size
    }


}
package com.kingtech.intime.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kingtech.intime.data.Task
import com.kingtech.intime.databinding.ItemContainerTaskBinding

class TaskAdapter(val task: List<Task>) : RecyclerView.Adapter<TaskAdapter.TodoViewHolder>() {

    inner class TodoViewHolder(private val binding: ItemContainerTaskBinding)
        : RecyclerView.ViewHolder(binding.root) {
            fun bind(taskModel: Task) {
               binding.tvTitleTask.text = taskModel.title
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(ItemContainerTaskBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(task[position])
    }

    override fun getItemCount(): Int {
        return task.size
    }


}
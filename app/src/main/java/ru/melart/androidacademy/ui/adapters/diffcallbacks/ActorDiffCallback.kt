package ru.melart.androidacademy.ui.adapters.diffcallbacks

import androidx.recyclerview.widget.DiffUtil
import ru.melart.androidacademy.data.ActorItem

class ActorDiffCallback : DiffUtil.ItemCallback<ActorItem>() {
    override fun areItemsTheSame(oldItem: ActorItem, newItem: ActorItem): Boolean = newItem.id == oldItem.id

    override fun areContentsTheSame(oldItem: ActorItem, newItem: ActorItem): Boolean = newItem == oldItem
}
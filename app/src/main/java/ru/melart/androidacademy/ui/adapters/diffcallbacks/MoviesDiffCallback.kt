package ru.melart.androidacademy.ui.adapters.diffcallbacks

import androidx.recyclerview.widget.DiffUtil
import ru.melart.androidacademy.data.MovieItem

class MoviesDiffCallback : DiffUtil.ItemCallback<MovieItem>() {
    override fun areItemsTheSame(oldItem: MovieItem, newItem: MovieItem): Boolean = oldItem.id == newItem.id


    override fun areContentsTheSame(oldItem: MovieItem, newItem: MovieItem): Boolean = newItem == oldItem
}
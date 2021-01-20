package ru.melart.androidacademy.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import ru.melart.androidacademy.R
import ru.melart.androidacademy.data.MovieItem
import ru.melart.androidacademy.ui.adapters.diffcallbacks.MoviesDiffCallback

class MoviesAdapter(private val onClickListener: () -> Unit) : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    private val differ = AsyncListDiffer(this, MoviesDiffCallback())

    var movies: List<MovieItem>
        set(value) {
            differ.submitList(value)
        }
        get() = differ.currentList

    class MoviesViewHolder(view: View, private val onClickListener: () -> Unit) : RecyclerView.ViewHolder(view) {

        fun bind(movieItem: MovieItem) {

        }

        init {
            itemView.setOnClickListener { onClickListener() }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_movie, parent, false)
        return MoviesViewHolder(view, onClickListener)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount(): Int = movies.size
}
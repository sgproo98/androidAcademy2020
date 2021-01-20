package ru.melart.androidacademy.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import ru.melart.androidacademy.R
import ru.melart.androidacademy.data.ActorItem
import ru.melart.androidacademy.ui.adapters.diffcallbacks.ActorDiffCallback

class ActorAdapter : RecyclerView.Adapter<ActorAdapter.ActorViewHolder>() {

    private val differ = AsyncListDiffer(this, ActorDiffCallback())

    var actors: List<ActorItem>
        set(value) {
            differ.submitList(value)
        }
        get() = differ.currentList

    class ActorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(actorItem: ActorItem) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_actor, parent, false)
        return ActorViewHolder(view)
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        holder.bind(actors[position])
    }

    override fun getItemCount(): Int = actors.size
}
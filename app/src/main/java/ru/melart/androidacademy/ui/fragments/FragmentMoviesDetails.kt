package ru.melart.androidacademy.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_movie_details.*
import kotlinx.android.synthetic.main.fragment_movie_details.view.*
import ru.melart.androidacademy.R
import ru.melart.androidacademy.ui.adapters.ActorAdapter
import ru.melart.androidacademy.utils.ActorUtils

class FragmentMoviesDetails : Fragment(R.layout.fragment_movie_details) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        backButton.setOnClickListener {
            requireActivity().onBackPressed()
        }

        val adapter = ActorAdapter()
        val items = ActorUtils.generateActorItems(10)
        adapter.actors = items

        actorAdapter.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        actorAdapter.adapter = adapter
    }

    companion object {
        fun getInstance() = FragmentMoviesDetails()
    }
}
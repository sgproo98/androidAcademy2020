package ru.melart.androidacademy.ui.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_movies_list.*
import ru.melart.androidacademy.R
import ru.melart.androidacademy.ui.activities.contracts.Iteractor
import ru.melart.androidacademy.ui.adapters.MoviesAdapter
import ru.melart.androidacademy.utils.MoviesUtils

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list) {

    private var iteractor: Iteractor? = null

    override fun onAttach(context: Context) {
        iteractor = context as? Iteractor ?: throw IllegalStateException("You don't use contract")
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        val adapter = MoviesAdapter { iteractor?.onClick() }
        val items = MoviesUtils.generateListOfMovieItem(20)
        adapter.movies = items
        filmRecycler.setHasFixedSize(true)
        filmRecycler.adapter = adapter
        filmRecycler.layoutManager = GridLayoutManager(requireContext(), 2)
    }

    override fun onDetach() {
        iteractor = null
        super.onDetach()
    }

    companion object {
        fun getInstance() = FragmentMoviesList()
    }
}
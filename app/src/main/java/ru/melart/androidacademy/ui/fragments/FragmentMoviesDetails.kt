package ru.melart.androidacademy.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_movie_details.view.*
import ru.melart.androidacademy.R

class FragmentMoviesDetails : Fragment(R.layout.fragment_movie_details) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.backButton.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    companion object {
        fun getInstance() = FragmentMoviesDetails()
    }
}
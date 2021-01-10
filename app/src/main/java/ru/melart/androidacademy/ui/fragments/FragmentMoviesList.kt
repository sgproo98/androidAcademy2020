package ru.melart.androidacademy.ui.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_movies_list.view.*
import ru.melart.androidacademy.R
import ru.melart.androidacademy.ui.activities.contracts.Iteractor
import java.lang.IllegalStateException

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list) {

    private var iteractor: Iteractor? = null

    override fun onAttach(context: Context) {
        iteractor = context as? Iteractor ?: throw IllegalStateException("You don't use contract")
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.listItem.setOnClickListener {
            iteractor?.onClick()
        }
    }

    override fun onDetach() {
        iteractor = null
        super.onDetach()
    }

    companion object {
        fun getInstance() = FragmentMoviesList()
    }
}
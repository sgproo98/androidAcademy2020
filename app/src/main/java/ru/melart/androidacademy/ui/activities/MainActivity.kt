package ru.melart.androidacademy.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.melart.androidacademy.R
import ru.melart.androidacademy.ui.activities.contracts.Iteractor
import ru.melart.androidacademy.ui.fragments.FragmentMoviesDetails
import ru.melart.androidacademy.ui.fragments.FragmentMoviesList

class MainActivity : AppCompatActivity(), Iteractor {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            initFragment()
        }
    }

    private fun initFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, FragmentMoviesList.getInstance(), FRAGMENT_MOVIES_LIST_KEY)
            .commit()
    }

    override fun onClick() {
        supportFragmentManager.beginTransaction()
            .hide(supportFragmentManager.findFragmentByTag(FRAGMENT_MOVIES_LIST_KEY)!!)
            .add(
                R.id.fragmentContainer,
                FragmentMoviesDetails.getInstance(),
                FRAGMENT_MOVIES_DETAILS_KEY
            )
            .addToBackStack(null)
            .commit()
    }

    companion object {
        private const val FRAGMENT_MOVIES_LIST_KEY =
            "ru.melart.androidacademy.ui.activities.MainActivity.FRAGMENT_MOVIE_LIST_KEY"
        private const val FRAGMENT_MOVIES_DETAILS_KEY =
            "ru.melart.androidacademy.ui.activities.MainActivity.FRAGMENT_MOVIES_DETAILS_KEY"
    }
}
package ru.melart.androidacademy.utils

import ru.melart.androidacademy.data.MovieItem

object MoviesUtils {
    fun generateListOfMovieItem(count: Int): List<MovieItem> {
        return List(count) {
            MovieItem(10, 10, 3, "asd", "asd", "", "", "", false)
        }
    }
}
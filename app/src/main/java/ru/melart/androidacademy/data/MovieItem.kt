package ru.melart.androidacademy.data

data class MovieItem(
    val id: Long,
    val posterId: Long,
    val rating: Byte,
    val genres: String,
    val name: String,
    val duration: String,
    val age: String,
    val reviewers: String,
    val isFavorite: Boolean
)

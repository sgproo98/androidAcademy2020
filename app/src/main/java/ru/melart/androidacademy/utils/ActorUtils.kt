package ru.melart.androidacademy.utils

import ru.melart.androidacademy.data.ActorItem

object ActorUtils {
    fun generateActorItems(count: Int): List<ActorItem> = List(count) { ActorItem(it.toLong(), it.toLong(), "") }
}
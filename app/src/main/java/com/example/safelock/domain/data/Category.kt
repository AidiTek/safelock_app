package com.example.safelock.domain.data

data class Category(
    val id: Int,
    val iconRes: Int, //Иконка категорий
    val title: String, //Название категорий
    var count: Int //количество элементов в категорий
)

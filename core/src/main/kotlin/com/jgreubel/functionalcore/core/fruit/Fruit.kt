package com.jgreubel.functionalcore.core.fruit

data class Fruit (
    val id: Long,
    val name: String,
    val color: Color
)

data class CreateFruitContent (
    val name: String,
    val color: Color
)

enum class Color {
    Red,
    Green,
    Yellow
}
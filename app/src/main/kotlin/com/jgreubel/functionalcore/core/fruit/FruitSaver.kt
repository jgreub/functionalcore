package com.jgreubel.functionalcore.core.fruit

interface FruitSaver {

    fun save(createFruitContent: CreateFruitContent): Fruit

    fun findById(id: Long): Fruit?

}
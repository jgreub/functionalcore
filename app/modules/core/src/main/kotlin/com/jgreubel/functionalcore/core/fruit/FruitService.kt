package com.jgreubel.functionalcore.core.fruit

import javax.inject.Named

@Named
class FruitService(
    private val fruitSaver: FruitSaver
) {

    fun create(createFruitContent: CreateFruitContent): Fruit {
        return fruitSaver.save(createFruitContent)
    }

    fun findById(id: Long): Fruit? {
        return fruitSaver.findById(id)
    }

}
package com.jgreubel.functionalcore.core.fruit

import org.springframework.stereotype.Component

@Component
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
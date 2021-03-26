package com.jgreubel.functionalcore.web.fruit

import com.jgreubel.functionalcore.core.fruit.CreateFruitContent
import com.jgreubel.functionalcore.core.fruit.Fruit
import com.jgreubel.functionalcore.core.fruit.FruitService
import org.springframework.web.bind.annotation.*

@RestController
class FruitController(
    private val fruitService: FruitService
) {

    @PostMapping("/fruit")
    fun create(@RequestBody createFruitContent: CreateFruitContent): Fruit {
        return fruitService.create(createFruitContent)
    }

    @GetMapping("/fruit/{id}")
    fun findById(@PathVariable id: Long): Fruit {
        return fruitService.findById(id) ?: throw RuntimeException("No Fruit Found")
    }

}
package com.jgreubel.functionalcore.data.fruit

import com.jgreubel.functionalcore.core.fruit.CreateFruitContent
import com.jgreubel.functionalcore.core.fruit.Fruit
import com.jgreubel.functionalcore.core.fruit.FruitSaver
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class FruitSaverImpl(
    private val fruitRepository: FruitRepository
) : FruitSaver {
    override fun save(createFruitContent: CreateFruitContent): Fruit {
        val fruitRecord = FruitRecord(
            id = 0,
            name = createFruitContent.name,
            color = createFruitContent.color
        )

        val savedFruitRecord = fruitRepository.save(fruitRecord)

        return convertFromRecord(savedFruitRecord)
    }

    override fun findById(id: Long): Fruit? {
        return fruitRepository.findByIdOrNull(id)?.let { convertFromRecord(it) }
    }

    /** Helpers **/

    private fun convertFromRecord(savedFruitRecord: FruitRecord): Fruit {
        return Fruit(
            id = savedFruitRecord.id,
            name = savedFruitRecord.name,
            color = savedFruitRecord.color
        )
    }

}
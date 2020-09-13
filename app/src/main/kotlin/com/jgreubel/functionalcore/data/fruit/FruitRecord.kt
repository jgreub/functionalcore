package com.jgreubel.functionalcore.data.fruit

import com.jgreubel.functionalcore.core.fruit.Color
import javax.persistence.*

@Entity
data class FruitRecord(
    @Id
    @GeneratedValue
    val id: Long,
    val name: String,
    @Enumerated(EnumType.STRING)
    val color: Color
)
package com.jgreubel.functionalcore.data.fruit

import org.springframework.data.jpa.repository.JpaRepository

interface FruitRepository : JpaRepository<FruitRecord, Long>
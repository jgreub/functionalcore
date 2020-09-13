package com.jgreubel.functionalcore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FunctionalCoreApplication

fun main(args: Array<String>) {
	runApplication<FunctionalCoreApplication>(*args)
}

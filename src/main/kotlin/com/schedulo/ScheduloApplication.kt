package com.schedulo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@EnableMongoRepositories
@SpringBootApplication
class ScheduloApplication

fun main(args: Array<String>) {
	runApplication<ScheduloApplication>(*args)
}

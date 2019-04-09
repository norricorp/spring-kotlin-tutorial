package com.norricorp.demo1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Demo1Application

fun main(args: Array<String>) {
	println("NORRIS: into main and runApplication")
	runApplication<Demo1Application>(*args) 
}

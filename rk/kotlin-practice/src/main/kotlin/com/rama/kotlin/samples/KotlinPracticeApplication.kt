package com.rama.kotlin.samples

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.rama.kotlin"])
class KotlinPracticeApplication

fun main(args: Array<String>) {
    System.out.println("Message")
    SpringApplication.run(KotlinPracticeApplication::class.java, *args)
}

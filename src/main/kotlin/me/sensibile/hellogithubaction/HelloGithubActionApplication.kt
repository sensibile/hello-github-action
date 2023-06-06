package me.sensibile.hellogithubaction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloGithubActionApplication

fun main(args: Array<String>) {
    runApplication<HelloGithubActionApplication>(*args)
}

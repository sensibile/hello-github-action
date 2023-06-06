package me.sensibile.hellogithubaction

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/greeting")
    fun greeting(
        @RequestParam(required = false, defaultValue = "World") name: String
    ): String {
        return "Hello, ${name}!"
    }
}
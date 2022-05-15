package br.com.yan.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller("/hello")
class HelloWorldController {

    @Get
    fun helloWorld(): String {
        return "Hello, World!"
    }

    @Get("/{name}")
    fun helloName(@PathVariable name: String): String {
        return "Hello, ${name.capitalize()}!"
    }

}
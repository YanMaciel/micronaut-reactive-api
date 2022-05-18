package br.com.yan

import io.micronaut.runtime.Micronaut.build

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("br.com.yan")
        .start()
}


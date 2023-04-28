package com.aliozdemir.kotlincoroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main (){

    println("x")

    runBlocking {

        println("a")

        launch {
            println("b")
            delay(6000)
            println("run blocking")
        }

        println("c")

        coroutineScope {

            println("d")

            launch {
                println("e")
                delay(4000)
                println("coroutine scope")
            }

            println("f")

        }

        println("g")

    }

    println("y")

}
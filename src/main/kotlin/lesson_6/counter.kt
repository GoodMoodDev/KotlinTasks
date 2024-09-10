package org.example.lesson_6

fun main() {
    var counter = 10
    println("Начинается обратный отсчет:")
        while (counter >= 0) {
            println(counter--)
            Thread.sleep(1000)
        }
    println("Отсчет закончен.")
    }
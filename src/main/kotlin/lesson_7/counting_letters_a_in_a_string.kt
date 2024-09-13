package org.example.lesson_7

fun main() {
    val text = "Котлин - это современный статически типизированный язык программирования"
    var count = 0
    for (char in text) {
        if (char == 'а') {
            count++
        }
    }
    println("Количество букв 'а': $count")
}
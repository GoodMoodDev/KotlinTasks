package org.example.lesson_7

fun main() {
    val numbers = arrayOf(3,5,7,2,8)
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    println("Максимальное число: $max")
}
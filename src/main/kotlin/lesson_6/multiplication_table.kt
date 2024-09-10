package org.example.lesson_6

fun main() {

    println("Введите число для вывода таблицы умножения: ")
    val number = readLine()!!.toInt()
    var multiplier = 1

    while (multiplier <= 10) {
        println("$number x $multiplier = ${number * multiplier}")
        multiplier++
    }
}
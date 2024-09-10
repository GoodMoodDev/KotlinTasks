package org.example.lesson_6

fun main() {
    var sum = 0
    var number: Int

    println("Введите числа для суммирования. Введите отрицательное число для завершения.")

    while (true) {
        println("Введите число:")
        number = readLine()!!.toInt()

        if (number < 0) {
            break
        }
        sum += number
    }

    println("Сумма введенных чисел: $sum")
}
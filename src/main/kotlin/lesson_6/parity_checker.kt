package org.example.lesson_6

fun main() {
    var number: Int

    println("Введите числа для проверки на четность. Введите 0 для завершения.")

    while (true) {
        println("Введите число:")
        number = readLine()!!.toInt()

        if (number == 0) {
            break
        }

        if (number % 2 == 0) {
            println("$number - четное число.")
        } else {
            println("$number - нечетное число.")
        }
    }
}
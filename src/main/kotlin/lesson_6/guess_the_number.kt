package org.example.lesson_6

fun main() {
    val secretNumber = 7
    var guess: Int

    println("Угадайте число от 1 до 10.")

    do {
        println("Введите ваше предположение: ")
        guess = readLine()!!.toInt()

        if (guess != secretNumber) {
            println("Неправильно, попробуйте еще раз.")
        }
    } while (guess != secretNumber)

    println("Поздравляем, вы угадали!")
}
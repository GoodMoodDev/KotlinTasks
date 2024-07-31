package org.example.lesson_5

fun main() {
    println("Докажите что вы не бот: 2+2=?")
    val enteredAnswer = readLine()?.toIntOrNull() ?: 0
    val correctAnswer = 4

    val result = enteredAnswer == correctAnswer

    if (result) println("Добро пожаловать")
    else println("Доступ запрещен")
}
package org.example.lesson_5

const val CURRENT_YEAR = 2024
const val AGE_OF_MAJORITY = 18

fun main() {
    val enteredData = readLine()?.toIntOrNull() ?: 0

    val calculateUserAge = CURRENT_YEAR - enteredData >= AGE_OF_MAJORITY

    if (calculateUserAge) println("Показывать экран со скрытым контентом")
    else println("Доступ закрыт")
}
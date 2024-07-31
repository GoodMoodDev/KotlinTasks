package org.example.lesson_5

fun main() {
    // Ввод данных
    println("Введите любое первое число от 0 до 42.")
    val firstEnteredNumber = readLine()!!.toInt()
    val firstCorrectNumber = 24

    println("Теперь введите любое второе число от 0 до 42.")
    val secondEnteredNumber = readLine()!!.toInt()
    val secondCorrectNumber = 12

    // Вычисление правильного ответа
    val results = firstEnteredNumber == firstCorrectNumber && secondEnteredNumber == secondCorrectNumber
    val results2 = firstEnteredNumber == firstCorrectNumber || secondEnteredNumber == secondCorrectNumber

    // Вывод данных
    val final2 = when {
        results -> "Поздравляем! Вы выиграли главный приз!"
        results2 -> "Вы выйграли утешительный приз!"
        else -> "Неудача!"
    }
    println("$final2 Правильные числа 24 и 12")
}
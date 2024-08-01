package org.example.lesson_5

import kotlin.random.Random

fun main() {
    // Генерация случайных чисел
    val lotNumbers = generateRandomNumbers(3, 0..42)

    // Ввод чисел пользователем
    val userNumbers = readUserNumbers(3)

    // Определение совпадений
    val matchedNumbers = lotNumbers.intersect(userNumbers)
    val matchCount = matchedNumbers.size

    // Вывод результата
    when (matchCount) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз.")
        else -> println("К сожалению, вы не угадали ни одного числа.")
    }

    // Вывод выигрышных чисел
    println("Выигрышные числа: $lotNumbers")
}

fun generateRandomNumbers(count: Int, range: IntRange): Set<Int> {
    val numbers = mutableSetOf<Int>()
    while (numbers.size < count) {
        numbers.add(Random.nextInt(range.start, range.endInclusive + 1))
    }
    return numbers
}

fun readUserNumbers(count: Int): Set<Int> {
    val userNumbers = mutableSetOf<Int>()
    println("Введите $count числа от 0 до 42:")
    while (userNumbers.size < count) {
        val input = readLine()?.toIntOrNull()
        if (input != null && input in 0..42) {
            userNumbers.add(input)
        } else {
            println("Некорректный ввод. Пожалуйста, введите число от 0 до 42.")
        }
    }
    return userNumbers
}
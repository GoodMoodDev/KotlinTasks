package org.example.lesson_4

fun main() {
    val trainingDay: Byte = 5
    val intervalBetweenDays: Byte = 2

    val isArmAndAbsDay = trainingDay % 2 != 0
    val isLegAndBackDay = !isArmAndAbsDay

    val output = """
        Упражнения для рук: $isArmAndAbsDay
        Упражнения для ног: $isLegAndBackDay
        Упражнения для спины: $isLegAndBackDay
        Упражнения для пресса: $isArmAndAbsDay
    """.trimIndent()

    println(output)
}
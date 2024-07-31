package org.example.lesson_4

fun main() {
    // Ввод данных
    println("Введите наличие повреждений (true/false):")
    val hasDamage = readLine()?.toBoolean() ?: false

    println("Введите текущий состав экипажа:")
    val crewSize = readLine()?.toIntOrNull() ?: 0

    println("Введите количество ящиков с провизией:")
    val foodBoxes = readLine()?.toIntOrNull() ?: 0

    println("Введите блогоприятность метеоусловий (true/false)")
    val isWeatherGood = readLine()?.toBoolean() ?: false

    // Условия для отправления в плавание
    val canSail = (!hasDamage && crewSize in 55..70 && foodBoxes > 50) || (hasDamage && crewSize == 70 && isWeatherGood && foodBoxes >= 50)

    // Вывод результата
    if (canSail) println("Корабль может отправиться в плавание.")
    else println("Корабль не может отправиться в плавание")
}
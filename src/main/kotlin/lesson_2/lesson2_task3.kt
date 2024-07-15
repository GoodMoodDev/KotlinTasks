package org.example.lesson_2

fun main() {
    val hour: Byte = 9
    val minute: Byte = 39
    val travelTime: Short = 457

    val departureTimeInMinutes: Int = 9 * 60 + 39
    val totalTime: Int = departureTimeInMinutes + travelTime
    val arrivalHours: Int = totalTime / 60
    val arrivalMinutes: Int = totalTime - arrivalHours * 60

    println("$arrivalHours:$arrivalMinutes")
}
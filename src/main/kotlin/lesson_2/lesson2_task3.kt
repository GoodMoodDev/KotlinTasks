package org.example.lesson_2

fun main() {
    var hour: Byte = 9
    var minute: Byte = 39
    var travelTime: Short = 457

    val departureTimeInMinutes: Int = 9 * 60 + 39
    val totalTime: Int = departureTimeInMinutes + travelTime
    val arrivalHours: Int = totalTime / 60
    val arrivalMinutes: Int = totalTime - arrivalHours * 60

    println("$arrivalHours:$arrivalMinutes")
}
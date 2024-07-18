package org.example.lesson_2

const val MINUTES_PER_HOUR = 60
fun main() {
    val hour: Byte = 9
    val minute: Byte = 39
    val travelTime: Short = 457

    val departureTimeInMinutes: Int = hour * MINUTES_PER_HOUR + minute
    val totalTime: Int = departureTimeInMinutes + travelTime
    val arrivalHours: Int = totalTime / MINUTES_PER_HOUR
    val arrivalMinutes: Int = totalTime - arrivalHours * MINUTES_PER_HOUR

    println("$arrivalHours:$arrivalMinutes")
}
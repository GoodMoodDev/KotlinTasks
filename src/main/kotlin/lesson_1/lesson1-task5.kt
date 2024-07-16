package org.example.lesson_1

fun main() {

    fun timeSecondsToStr(seconds: Int = 6480): String {
        val secondsPerHour: Short = 3600
        val minutesPerHour: Byte = 60
        val secondsPerMinute: Byte = 60
        val hour: Int = seconds / secondsPerHour
        val minute: Int = (seconds % secondsPerHour) / minutesPerHour
        val second: Int = seconds % secondsPerMinute
        return String.format("%02d:%02d:%02d", hour, minute, second)
    }
    println(timeSecondsToStr())
}
package org.example.lesson_1

fun main() {
    var second1: Short = 6480

    var hour: Int = second1 / 3600
    var minute1: Int = second1 - 3600
    var minute2: Int = minute1 / 60
    var second2: Int = minute2 * 60 - minute1

    println("0$hour:$minute2:0$second2")
}
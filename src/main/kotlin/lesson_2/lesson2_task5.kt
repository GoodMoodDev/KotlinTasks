package org.example.lesson_2

import kotlin.math.pow

const val ENTERED_AMOUNT: Int = 70000
fun main() {
    val interestRate: Double = 16.7
    val depositTime: Double = 20.0
    val hundredPercent: Byte = 100
    val numberOne: Byte = 1

    val depositSizeOverTime: Double = (numberOne + (interestRate / hundredPercent)).pow(depositTime) * ENTERED_AMOUNT

    println("%.3f".format(depositSizeOverTime))
}
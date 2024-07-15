package org.example.lesson_2

fun main() {
    var crystalOre: Byte = 7
    var metalOre: Byte = 11
    var buffPercent: Byte = 20
    val coeffPercent: Double = buffPercent / 100.0 + 1
    val buffCrystal: Double = crystalOre * coeffPercent
    val buffMetal: Double = metalOre * coeffPercent

    var results = """
        Cystal ore mined = $buffCrystal
        Metal ore mined = $buffMetal
    """.trimIndent()

    println(results)
}
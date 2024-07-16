package org.example.lesson_2

fun main() {
    val crystalOre: Byte = 7
    val metalOre: Byte = 11
    val buffPercent: Byte = 20
    val coeffPercent: Double = buffPercent / 100.0 + 1
    val buffCrystal: Double = crystalOre * coeffPercent
    val buffMetal: Double = metalOre * coeffPercent

    val results = """
        Crystal ore mined = $buffCrystal
        Metal ore mined = $buffMetal
    """.trimIndent()

    println(results)
}
package org.example.lesson_2

fun main() {
    val crystalOre: Byte = 7
    val metalOre: Byte = 11
    val buffPercent: Byte = 20
    val hundredPercent: Double = 100.0

    val crystalBuffPercent = crystalOre / hundredPercent * buffPercent + crystalOre
    val metalBuffPercent = metalOre / hundredPercent * buffPercent + metalOre
    val crystalBuffResult = crystalBuffPercent.toInt()
    val metalBuffResult = metalBuffPercent.toInt()

    val results = """
        Crystal ore mined = $crystalBuffResult
        Metal ore mined = $metalBuffResult
    """.trimIndent()

    println(results)
}
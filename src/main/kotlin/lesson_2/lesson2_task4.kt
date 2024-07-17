package org.example.lesson_2

fun main() {
    val crystalOre: Byte = 7
    val metalOre: Byte = 11
    val buffPercent: Byte = 20
    val coeffPercent: Double = buffPercent / 100.0 + 1
    val buffCrystalResult: Double = crystalOre * coeffPercent
    val buffMetalResult: Double = metalOre * coeffPercent
    val crystalWithBuff = buffCrystalResult.toInt()
    val metalWithBuff = buffMetalResult.toInt()

    val results = """
        Crystal ore mined = $crystalWithBuff
        Metal ore mined = $metalWithBuff
    """.trimIndent()

    println(results)
}
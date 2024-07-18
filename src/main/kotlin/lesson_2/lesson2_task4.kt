package org.example.lesson_2

fun main() {
    val crystalOre: Byte = 7
    val metalOre: Byte = 11
    val buffPercent: Byte = 20
    val hundredPercent: Float = 100f

    val bonusCrystalOre: Float = crystalOre / hundredPercent * buffPercent
    val bonusMetalOre: Float = metalOre / hundredPercent * buffPercent
    val roundedAmountOfCrystalOre = bonusCrystalOre.toInt()
    val roundedAmountOfMetalOre = bonusMetalOre.toInt()

    val results = """
        Bonus crystal ore from the mining buff = $roundedAmountOfCrystalOre
        Bonus metal ore from the mining buff = $roundedAmountOfMetalOre
    """.trimIndent()

    println(results)
}
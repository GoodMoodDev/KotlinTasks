package org.example.lesson_1

fun main() {
    val length: String = "40_868_600_000"
    val age: Byte = 27
    val partOfDay: Double = 0.075
    val seconds: Short = 6480
    val partOfYear: String = "2.0547945205479453E-4"
    val apogee: Int = 327000

    val multiString = """
        $length
        $age
        $partOfDay
        $seconds
        $partOfYear
        $apogee
    """.trimIndent()

    println(multiString)
}
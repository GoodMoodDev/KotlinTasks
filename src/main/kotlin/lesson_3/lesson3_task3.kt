package org.example.lesson_3

fun main() {
    val givenNumber: Byte = 8

    val table: String = """
        ${givenNumber * 1}
        ${givenNumber * 2}
        ${givenNumber * 3}
        ${givenNumber * 4}
        ${givenNumber * 5}
        ${givenNumber * 6}
        ${givenNumber * 7}
        ${givenNumber * 8}
        ${givenNumber * 9}
    """.trimIndent()

    println(table)
}
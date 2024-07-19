package org.example.lesson_4

const val TOTAL_NUMBER_OF_TABLES = 13

fun main() {
    val reservedTablesToday: Byte = 13
    val reservedTablesTomorrow: Byte = 4
    val howManyTablesNeeded: Byte = 6

    val freeTablesToday: Boolean = howManyTablesNeeded <= (TOTAL_NUMBER_OF_TABLES - reservedTablesToday)
    val freeTablesTomorrow: Boolean = howManyTablesNeeded <= (TOTAL_NUMBER_OF_TABLES - reservedTablesTomorrow)

    println("Доступность столиков на сегодня: $freeTablesToday\nДоступность столиков на завтра: $freeTablesTomorrow")
}
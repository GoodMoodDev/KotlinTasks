package org.example.lesson_2

fun main() {
    val student1: Byte = 3
    val student2: Byte = 4
    val student3: Byte = 3
    val student4: Byte = 5
    val numberOfStudents: Float = 4f

    val totalNumberOfStudents: Int = student1 + student2 + student3 + student4
    val classAverage: Float = totalNumberOfStudents / numberOfStudents

    println(classAverage)
}
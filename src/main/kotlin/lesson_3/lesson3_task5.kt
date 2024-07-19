package org.example.lesson_3

const val PROGRESS_DATA = "D2-D4;0"
fun main() {
    val (component1, component2, component3) = PROGRESS_DATA.split("-",";")
    println(component1)
    println(component2)
    println(component3)
}
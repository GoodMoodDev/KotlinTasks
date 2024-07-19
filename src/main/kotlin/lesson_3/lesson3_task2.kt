package org.example.lesson_3

fun main() {
    var surName: String = "Андреева"
    val name: String = "Татьяна"
    val patronymic: String = "Александровна"
    var age: String = "20 лет"

    println("$surName $name $patronymic, $age.")

    surName = "Сидорова"
    age = "22 года"

    println("$surName $name $patronymic, $age.")
}
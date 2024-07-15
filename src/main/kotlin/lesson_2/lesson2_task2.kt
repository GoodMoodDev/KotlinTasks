package org.example.lesson_2

fun main() {
    var worker: Byte = 50
    var workerSalary: Short = 30000
    var intern: Byte = 30
    var internSalary: Short = 20000

    val costsOnWorkers: Int = worker * workerSalary
    val costsOnInterns: Int = intern * internSalary
    val allCosts: Int = costsOnWorkers + costsOnInterns
    val allEmployers: Int = worker + intern
    val averageSalary: Int = allCosts / allEmployers

    val multiString: String = """
        $costsOnWorkers
        $allCosts
        $averageSalary
    """.trimIndent()

    println(multiString)
}
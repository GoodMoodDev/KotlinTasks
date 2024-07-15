package org.example.lesson_2

fun main() {
    val worker: Byte = 50
    val workerSalary: Short = 30000
    val intern: Byte = 30
    val internSalary: Short = 20000

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
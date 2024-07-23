package org.example.lesson_4

const val AVERAGE_WEIGHT_CARGO_FROM: Byte = 35
const val AVERAGE_WEIGHT_CARGO_TO: Byte = 100
const val AVERAGE_VOLUME_CARGO: Byte = 100

fun main() {
    val enteredCargoWeightData: Byte = 50
    val enteredCargoVolumeData: Byte = 100

    println("Груз с весом $enteredCargoWeightData кг и объемом $enteredCargoVolumeData л соответствует категории 'Average': ${enteredCargoWeightData > AVERAGE_WEIGHT_CARGO_FROM && enteredCargoWeightData <= AVERAGE_WEIGHT_CARGO_TO && enteredCargoVolumeData < AVERAGE_VOLUME_CARGO}")
}
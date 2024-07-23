package org.example.lesson_4

fun main() {
    val sunnyWeather: Boolean = true
    val tentIsNowOpen: Boolean = true
    val normalAirHumidity: Int = 20
    val normalTimeOfYear: String = "не зима"

    val currentWeatherIsSunny: Boolean = true
    val currentTentStatus: Boolean = true
    val currentAirHumidity: Int = 20
    val currentTimeOfYear: String = "зима"

    val comparisonResult: Boolean = (sunnyWeather == currentWeatherIsSunny) and (tentIsNowOpen == currentTentStatus) and (normalAirHumidity == currentAirHumidity) and (normalTimeOfYear == currentTimeOfYear)

    println("Благоприятны ли условия сейчас для роста бобовых? $comparisonResult")
}
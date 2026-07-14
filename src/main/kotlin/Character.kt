package org.example

import kotlin.String

class Character(
    var name: String,
    var availableTime: Int,
    var availableMoney: Float
) {
    fun chooseVehicle(chosenVehicle: List<Vehicle>): List<Vehicle> {
        var validVehicle = chosenVehicle.filter {
            it.price < availableMoney && it.time < availableTime
        }
        return validVehicle
    }
}


// The Character
var Artana = Character(
    "Artana",
    60,
    20000f
    )

var Apple = Character(
    "Apple",
    90,
    5000f
)

var Clover = Character(
    "Clover",
    30,
    35000f
)

val listCharacter = listOf(
    Artana, Apple, Clover
)

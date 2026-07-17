package org.example



// Interface & Class
interface Vehicle {
    val name: String
    val price: Float
    val time: Int
}

data class TwoWheel (
    override var name: String,
    override var price: Float,
    override var time: Int
): Vehicle{
    fun shortCut() {
        time -= (time * 15/100)
        println("The driver found a shortcut! Time reduced to $time")
    }
}

data class FourWheel (
    override var name: String,
    override var price: Float,
    override var time: Int
): Vehicle{
    fun raceMode() {
        time -= (time * 1/10)
        println("Race mode activated! Time reduced to $time")
    }
}

data class Freedom (
    override var name: String,
    override var price: Float,
    override var time: Int
): Vehicle{
    fun blessing() {
        time -= (time * 5/10)
        println("A random dude ask for you to come ride with him. Of course you accept! Time reduced to  $time")
    }
}

// The data (Two Wheel)

var onlineTaxibike = TwoWheel(
    "Online Taxi Bike",
    9000f,
    10
)

var regularTaxibike = TwoWheel(
    "Regular Taxi Bike",
    9000f,
    14
)

var bicycle = TwoWheel(
    "Bike",
    0f,
    25
)

// The data (Four Wheel)

var onlineTaxi = FourWheel(
    "Online Taxi",
    18000f,
    8
)

var regularTaxi = FourWheel(
    "Regular Taxi",
    12000f,
    12
)

var bus = FourWheel(
    "Bus",
    3500f,
    22
)

// The data (Freedom)

var run = Freedom(
    "Run",
    0f,
    35
)

//Phase 1 data
val phaseOneVehicle = listOf(onlineTaxibike, run, onlineTaxi)

//Phase 2 data
val phaseTwoVehicle = listOf(regularTaxibike, bus, onlineTaxibike)

//Phase 3 data
val phaseThreeVehicle = listOf(regularTaxi, run, onlineTaxi)
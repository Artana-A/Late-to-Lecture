package org.example

// Interface & Class
interface Vehicle {
    val price: Float
    val time: Int
}

data class TwoWheel (
    override var price: Float,
    override var time: Int
): Vehicle{
    fun shortCut() {
        time -= (time * 15/100)
        println("The driver found a shortcut! Time reduced to $time")
    }
}

data class FourWheel (
    override var price: Float,
    override var time: Int
): Vehicle{
    fun raceMode() {
        time -= (time * 1/10)
        println("Race mode activated! Time reduced to $time")
    }
}

data class Freedom (
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
    9000f,
    10
)

var regularTaxibike = TwoWheel(
    9000f,
    14
)

var bicycle = TwoWheel(
    0f,
    25
)

// The data (Four Wheel)

var onlineTaxi = FourWheel(
    18000f,
    8
)

var regularTaxi = FourWheel(
    12000f,
    12
)

var bus = FourWheel(
    3500f,
    22
)

// The data (Freedom)

var run = Freedom(
    0f,
    35
)
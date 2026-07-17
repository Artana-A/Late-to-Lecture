package org.example

fun phaseOne(player: Character): Character{

    println("You sprint out of your house and immediately notice the chaos of your neighborhood streets.")
    Thread.sleep(2000)
    println("Dogs are barking, neighbors are rushing their kids to school, and the sun is just somehow hotter than yesterday.")
    Thread.sleep(2000)
    println("You realize, you have to make a quick decision to save precious minutes!")
    Thread.sleep(2000)
    println("\nYou scan through the street, you chose to...")
    Thread.sleep(2000)

    chooseVehicle(player, phaseOneVehicle)

    return player
}

fun phaseTwo(player: Character): Character{

    println("You reach the main road with more transport options...")
    Thread.sleep(2000)
    println("You saw cars passing by busily, workers with their morning coffee rushing, wind blowing through your face.")
    Thread.sleep(2000)
    println("In the middle of chaos you look at your phone and notice there is ${player.availableTime} minutes left. ")
    Thread.sleep(2000)
    println("\nIn front of you, you saw a lot of transportation options:")
    Thread.sleep(2000)

    chooseVehicle(player, phaseTwoVehicle)

    return player
}

fun phaseThree(player: Character): Character{

    println("After some time, you realize that you are nearing campus!")
    Thread.sleep(2000)
    println("This time is crucial since it is the final push.")
    Thread.sleep(2000)
    println("\nWhat will you do?")
    Thread.sleep(2000)

    chooseVehicle(player, phaseThreeVehicle)

    return player
}
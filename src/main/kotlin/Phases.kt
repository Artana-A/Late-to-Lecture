package org.example

fun phaseOne(player: Character): Character{

    var phaseOne = arrayOf(
        "You sprint out of your house and immediately notice the chaos of your neighborhood streets.",
        "Dogs are barking, neighbors are rushing their kids to school, and the sun is just somehow hotter than yesterday.",
        "You realize, you have to make a quick decision to save precious minutes!",
        "\nYou scan through the street, you chose to..."
        )

    for (sentence in phaseOne){
        println(sentence)
        Thread.sleep(2000)
    }

    chooseVehicle(player, phaseOneVehicle)

    return player
}

fun phaseTwo(player: Character): Character{

    var phaseTwo = arrayOf(
        "You reach the main road with more transport options...",
        "You saw cars passing by busily, workers with their morning coffee rushing, wind blowing through your face.",
        "In the middle of chaos you look at your phone and notice there is ${player.availableTime} minutes left. ",
        "\nIn front of you, you saw a lot of transportation options:"
    )

    for (sentence in phaseTwo){
        println(sentence)
        Thread.sleep(2000)
    }

    chooseVehicle(player, phaseTwoVehicle)

    return player
}

fun phaseThree(player: Character): Character{

    var phaseThree = arrayOf(
        "After some time, you realize that you are nearing campus!",
        "This time is crucial since it is the final push.",
        "\nWhat will you do?"
    )

    for (sentence in phaseThree){
        println(sentence)
        Thread.sleep(2000)
    }

    chooseVehicle(player, phaseThreeVehicle)

    return player
}
package org.example

fun chooseVehicle(player:Character, listVehicle: List<Vehicle>): Character{
    var choice = 0
    while (choice !in 1..listVehicle.size) {
        for (i in listVehicle.indices){
            println("""
                ________________________________________
                 Available Vehicle #${i + 1} 
                 Vehicle      : ${listVehicle[i].name} 
                 Time         : ${listVehicle[i].time}
                 Price cost   : Rp${listVehicle[i].price}
                ________________________________________
                """.trimIndent())
            print("\n")
        }

        print("Your choice: ")
        choice = readln().toIntOrNull()?:0
    }

    val chosenVehicle = listVehicle[choice-1]

    // Money and Time logic
    player.availableTime -= chosenVehicle.time
    player.availableMoney -= chosenVehicle.price

    // Checking the character status
    print("\n")
    println("""
                Chosen Character 
                Name    : ${player.name} 
                Time    : ${player.availableTime}
                Money   : Rp${player.availableMoney}
                """.trimIndent()
    )

    return player
}
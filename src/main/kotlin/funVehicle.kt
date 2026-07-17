package org.example

fun chooseVehicle(player:Character, listVehicle: List<Vehicle>): Character{
    var choice = 0
    while (choice !in 1..listVehicle.size) {
        for (i in listVehicle.indices){
            println("""
                ________________________________________
                 Available Vehicle #${i + 1} 
                 Vehicle     : ${listVehicle[i].name} 
                 Price       : ${listVehicle[i].price}
                 Time cost   : Rp${listVehicle[i].time}
                ________________________________________
                """.trimIndent())
            print("\n")
        }

        print("Your choice: ")
        choice = readln().toIntOrNull()?:0
    }

    return player
}
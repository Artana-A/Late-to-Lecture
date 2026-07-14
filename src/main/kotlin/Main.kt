package org.example

fun main() {
    println("""
        ====================================================
        |                                                  |
        |               RACE AGAINST THE BELL              |
        |                   kawaii uwuhhhh                 |
        |                                                  |
        ====================================================
    """.trimIndent())

    var choice = 0
    while(choice != 1 && choice != 2){
        println("Do you want to start the game?")
        println("1. Yes")
        println("2. No")
        print("Your choice : ")
        choice = readln().toIntOrNull()?:0
        if (choice != 1 && choice != 2) {
            print("\nChoice invalid! Enter number 1 or 2\n")
        }
    }

    if(choice == 2) {
        return
    }

    fun chooseCharacter(availableCharacter: List<Character>):Character {
        choice = 0
        while (choice !in 1..listCharacter.size) {
            println("=== CHOOSE YOUR CHARACTER ===")

            for (i in availableCharacter.indices){
                println("""
                Character #${i+1} 
                ${availableCharacter[i].name} 
                (Waktu: ${availableCharacter[i].availableTime}
                Uang: Rp${availableCharacter[i].availableMoney})
                """.trimIndent())
            }

            print("Your choice: ")
            choice = readln().toIntOrNull()?:0
        }

        var player = availableCharacter[choice-1]

        return player
    }

}

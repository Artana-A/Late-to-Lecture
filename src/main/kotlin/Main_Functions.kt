package org.example

fun makeNewCharacter(): Character {
    print("\nInsert new character name: ")
    var newCharacterName = readln().ifBlank { "Bob" }

    print("Insert new character time (minutes): ")
    var newCharacterTime = readln().toIntOrNull()

    if (newCharacterTime == null) {
        newCharacterTime = 50
    }

    print("Insert new character money: ")
    var newCharacterMoney = readln().toFloatOrNull()

    if (newCharacterMoney == null) {
        newCharacterMoney = 30000f
    }

    return Character(
        name = newCharacterName,
        availableTime = newCharacterTime,
        availableMoney = newCharacterMoney
    )


}

fun chooseCharacter(availableCharacter: List<Character>):Character {
    var choice = 0
    while (choice !in 1..listCharacter.size) {
        println("\nChoose your character!\n")
        for (i in availableCharacter.indices){
            println("""
                Character #${i+1} 
                Name    : ${availableCharacter[i].name} 
                Time    : ${availableCharacter[i].availableTime}
                Money   : Rp${availableCharacter[i].availableMoney}
                """.trimIndent())
            print("\n")
        }

        print("Your choice: ")
        choice = readln().toIntOrNull()?:0
    }

    var player = availableCharacter[choice-1]

    return player
}

fun printPlayer(chosenPlayer: Character){
    print("\n")
    println("""
                Chosen Character 
                Name    : ${chosenPlayer.name} 
                Time    : ${chosenPlayer.availableTime}
                Money   : Rp${chosenPlayer.availableMoney}
                """.trimIndent()
    )

}
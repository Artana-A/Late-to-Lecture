package org.example

fun makeNewCharacter(): Character {
    print("\nInsert new character name: ")
    val newCharacterName = readln().ifBlank { "Bob" }

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
        println("\nChoose your character!")
        for (i in availableCharacter.indices){
            println("""
                _____________________________________________________
                 Character #${i+1} 
                 Name    : ${availableCharacter[i].name} 
                 Time    : ${availableCharacter[i].availableTime}
                 Money   : Rp${availableCharacter[i].availableMoney}
                _____________________________________________________
                """.trimIndent())
            print("\n")
        }

        print("Your choice: ")
        choice = readln().toIntOrNull()?:0
    }

    val player = availableCharacter[choice-1]

    return player
}
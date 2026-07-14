package org.example

fun makeNewCharacter(){
    print("Insert new character name: ")
    var newCharacterName = readln()

    var newCharacter = Character(
        name = newCharacterName,
        50,
        25000f)
}

fun chooseCharacter(availableCharacter: List<Character>):Character {
    var choice = 0
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
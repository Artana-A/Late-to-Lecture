package org.example

fun makeNewCharacter(){
    print("Insert new character name: ")
    var newCharacterName = readln()

    var newCharacter = Character(
        name = newCharacterName,
        50,
        25000f)
}
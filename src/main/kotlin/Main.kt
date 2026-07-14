package org.example

fun main() {
    println("""
        ====================================================
        |                                                  |
        |               RACE AGAINST THE BELL              |
        |                                                  |
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


}

package org.example

fun quitOrNext(){
    println("Press enter to continue... [enter q to quit]")
    var choice = readln().trim().lowercase()
    if (choice == "q" || choice == "quit" ) {
        print("\nChoice invalid! Enter or choose q\n")
       return
    }
}


package org.example

fun quitOrNext(): Boolean{
    var choice = " "
    while(choice != "q" && choice != "quit" && choice != ""){
        println("Press enter to continue... [enter q to quit]")
        choice = readln().trim().lowercase()
    }

    if (choice == "q" || choice == "quit" ) {
        print("\nExiting program...\n")
        return true
    }

    return false
}

fun loosingCondition(player:Character): Boolean{
    if(player.availableMoney<0 && player.availableTime<0){
        println("With no money nor time left, you end up sitting helplessly on the sidewalk. \n" +
                "You stare blankly into space while mourning your ruined attendance record..."
        )
        return true
    }

    else if(player.availableMoney<0){
        println("You have Rp${player.availableMoney} balance... \n" +
                "ride-sharing driver forced you to get off... \n" +
                "in the middle of nowhere... because you couldn't pay the fare."
        )
        return true
    }

    else if(player.availableTime<0){
        println("You helplessly look into your watch... \n" +
                "You were ${player.availableTime * -1} minutes late into class\n" +
                "You saw your friend's message, the lecturer already locked the classroom..."
        )
        return true
    }
    return false
}
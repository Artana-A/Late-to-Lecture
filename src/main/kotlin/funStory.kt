package org.example

// Ending
fun ending(player: Character) {

    var ending = arrayOf(
        "\n\nAfter a while...",
        "You see the gates of your university ahead. The place is filled with students hanging around.",
        "\nYou glance at your watch...",
        "Just in time, ${player.name}!",
        "You made it with ${player.availableTime} minutes to spare!",
        "You hurriedly went to class and see your friends chatting.",
        "You find your seat, catch your breath, and feel a sense of accomplishment.",
        "\n[THE END]"
    )

    for (sentence in ending) {
        println(sentence)
        Thread.sleep(2000)
    }
}

// Opening
fun opening(player: Character){

    var opening = arrayOf(
        "\n\nZzzzz.....",
        "BEEP BEEP BEEP!!!",
        "${player.name}: Wtf,, why is it so loud!?",
        """
       \ \ \ | | | / / /
         _____________ 
         |  [Alarm]  |
         -------------
         |   06:30   |
         -------------
    """.trimIndent(),
        "${player.name}: I'm late to my first day of uni??? ",
        "${player.name}: Better hurry up!",
        "\nYou quickly got yourself ready and realize...",
        "You need to take multiple transportation to get to your beloved uni",
        "In the midst of panicking, you took a peek inside your wallet...",
        "You noticed that there is only Rp${player.availableMoney}!",
        "You look at your watch...",
        "It is already 7.30! You only got ${player.availableTime} minutes",
        "considering the time you need to run to your class.\n"
    )

    for (sentence in opening) {
        println(sentence)
        Thread.sleep(2000)
    }

    quitOrNext()
}

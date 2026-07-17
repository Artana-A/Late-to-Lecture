package org.example

// Ending
fun ending(player: Character){
    println("\n\nAfter a while...")
    Thread.sleep(2000)
    println("You see the gates of your university ahead. The place is filled with students hanging around.")
    Thread.sleep(2000)
    println("\nYou glance at your watch...")
    Thread.sleep(2000)
    println("Just in time, ${player.name}!")
    Thread.sleep(2000)
    println("You made it with ${player.availableTime} minutes to spare!")
    Thread.sleep(2000)
    println("You hurriedly went to class and see your friends chatting.")
    Thread.sleep(2000)
    println("You find your seat, catch your breath, and feel a sense of accomplishment.")
    Thread.sleep(2000)
    println("\n\n[THE END]")
    Thread.sleep(2000)

}

// Opening
fun opening(player: Character){
    println("\n\nZzzzz.....")
    Thread.sleep(2000)
    println("BEEP BEEP BEEP!!!")
    Thread.sleep(2000)
    println("${player.name}: Wtf,, why is it so loud!?")
    Thread.sleep(2000)
    println("""
       \ \ \ | | | / / /
         _____________ 
         |  [Alarm]  |
         -------------
         |   06:30   |
         -------------
    """.trimIndent())
    Thread.sleep(2000)
    println("${player.name}: I'm late to my first day of uni??? ")
    Thread.sleep(2000)
    println("${player.name}: Better hurry up!")
    Thread.sleep(2500)
    println("You quickly got yourself ready and realize...")
    Thread.sleep(2000)
    println("You need to take multiple transportation to get to your beloved uni")
    Thread.sleep(2000)
    println("In the midst of panicking, you took a peek inside your wallet...")
    Thread.sleep(2000)
    println("You noticed that there is only Rp${player.availableMoney}!")
    Thread.sleep(2000)
    println("You look at your watch...")
    Thread.sleep(2000)
    println("It is already 7.30! You only got ${player.availableTime} minutes")
    Thread.sleep(2000)
    println("considering the time you need to run to your class.\n")
    quitOrNext()
}

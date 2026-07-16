package org.example

// Ending
fun ending(player: Character){

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

    println("""
        
        You quickly got yourself ready and realize...
        You need to take multiple transportation to get to your beloved uni
        
    """.trimIndent())
    Thread.sleep(2000)

    println("In the midst of panicking, you took a peek inside your wallet...")
    Thread.sleep(2000)
    println("You noticed that there is only Rp${player.availableMoney}!")
    Thread.sleep(2000)
    println("You look at your watch...")
    Thread.sleep(2000)
    println("It is already 7.30! You only got ${player.availableTime} minutes")
    Thread.sleep(2000)
    println("considering the time you need to run to your class.")
    Thread.sleep(2000)
}

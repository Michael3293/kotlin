 const val HERO_NAME = "John" // I changed the name from Madrigal

fun main() {
    println("The hero announces her presence to the world")

    println(HERO_NAME)

    var playerlevel = 1
    println(playerlevel)

    if (playerlevel == 1) {
        println("Meet Mr. Bubbles in the Land of Soft Things")
    } else if (playerlevel <= 5) {
        println("Save the town from the barbarians invasions")
    } else if (playerlevel == 6) {
        println("Locate the Enchanted sword")
    } else if (playerlevel == 7) {
        println("Recover the long-lost artifact of creation")
    } else if (playerlevel == 8) {
        println("Defeat Nogartes, bringer of death and eater of worlds")
    }

    }
    
    else {
        println("There are no quests right now.")
    }

    println("Time passes...")
    println("The hero returns to her quest")

    playerlevel += 1
    println(playerlevel)
}

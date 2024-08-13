package org.example

class AlphabetWar {
    fun alphabetWar(fight: String): String {
        val leftSide = mapOf(
            'w' to 4,
            'p' to 3,
            'b' to 2,
            's' to 1
        )
        val rightSide = mapOf(
            'm' to 4,
            'q' to 3,
            'd' to 2,
            'z' to 1
        )

        val leftSideWins = "Left side wins!"
        val rightSideWins = "Right side wins!"
        val draw = "Let's fight again!"

        val leftSidePower = fight.filter { it in leftSide }.sumOf{ leftSide[it] ?: 0 }
        val rightSidePower = fight.filter{ it in rightSide }.sumOf{ rightSide[it] ?: 0}
        val battleResult = leftSidePower - rightSidePower

        if( battleResult == 0 )
            return draw
        if( battleResult > 0 )
            return leftSideWins
        return rightSideWins
    }
}
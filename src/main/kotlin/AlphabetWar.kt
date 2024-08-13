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
        val battleResult = getSideScore( fight, leftSide ) - getSideScore( fight, rightSide )

        if( battleResult == 0 )
            return draw
        if( battleResult > 0 )
            return leftSideWins

        return rightSideWins
    }

    private fun getSideScore( str: String, sideScore: Map<Char, Int> ): Int{
        return str.filter { it in sideScore }.sumOf{ sideScore[it] ?: 0 }
    }
}
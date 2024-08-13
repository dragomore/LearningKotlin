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
        val battleResult = getBattleResult( fight, leftSide, rightSide )

        if( battleResult == 0 )
            return draw
        if( battleResult > 0 )
            return leftSideWins
        return rightSideWins
    }

    private fun getBattleResult( str: String, leftScore: Map<Char, Int>, rightScore: Map<Char, Int> ): Int{
        val leftSidePower = str.filter { it in leftScore }.sumOf{ leftScore[it] ?: 0 }
        val rightSidePower = str.filter{ it in rightScore }.sumOf{ rightScore[it] ?: 0 }
        return leftSidePower - rightSidePower
    }
}
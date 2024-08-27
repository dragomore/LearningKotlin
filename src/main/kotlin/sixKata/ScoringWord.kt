package org.example.sixKata

class ScoringWord {
    fun high(str: String) : String {
        val strings = str.split(" ")
        val scores = str.split(" ")
            .map{ getStringCount( it ) }
        val max = scores.max()
        val index = scores.indexOf( max )

        return strings[index]
    }

    private fun getStringCount( string: String ): Int{
        val alphabetScore: Map<Char, Int> = mapOf(
            'a' to 1,
            'b' to 2,
            'c' to 3,
            'd' to 4,
            'e' to 5,
            'f' to 6,
            'g' to 7,
            'h' to 8,
            'i' to 9,
            'j' to 10,
            'k' to 11,
            'l' to 12,
            'm' to 13,
            'n' to 14,
            'o' to 15,
            'p' to 16,
            'q' to 17,
            'r' to 18,
            's' to 19,
            't' to 20,
            'u' to 21,
            'v' to 22,
            'w' to 23,
            'x' to 24,
            'y' to 25,
            'z' to 26
        )

        var score = 0

        for( char in string ){
           if( char in alphabetScore ){
               score += alphabetScore.getValue( char )
           }
        }

        return score
    }
}
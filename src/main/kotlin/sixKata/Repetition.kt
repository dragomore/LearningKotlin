package org.example.sixKata

class Repetition {
    fun longestRepetition( s: String ): Pair<Char?,Int> {
        if( s.isEmpty() )
            return Pair( null, 0 )

        val charsList: MutableList<String> = mutableListOf()
        var previousChar: Char = s[ 0 ]
        val str = StringBuilder()
        for( char in s ){
            if( char == previousChar ){
                str.append( char )
            }
            else{
                charsList.add( str.toString() )
                previousChar = char
                str.clear()
                str.append( char )
            }
        }
        charsList.add( str.toString() )
        val charsRepetitions = charsList.map{ it.count() }
        val maxRepetitionsIndex = charsRepetitions.indexOf( charsRepetitions.max() )

        val repetitionChar = charsList[maxRepetitionsIndex].first()
        val maxRepetitions = charsRepetitions.max()

        return Pair( repetitionChar, maxRepetitions )
    }
}
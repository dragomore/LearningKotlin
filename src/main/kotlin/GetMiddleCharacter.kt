package org.example

class GetMiddleCharacter {
    fun getMiddle( word: String ): String{
        if( word.isEmpty() )
            return ""
        val wordLength = word.length
        val middleCharIdx = wordLength / 2
        return if( word.length % 2 == 0 ) {
            "${word[middleCharIdx - 1]}${word[middleCharIdx]}"
        } else
            word[middleCharIdx].toString()
    }
}
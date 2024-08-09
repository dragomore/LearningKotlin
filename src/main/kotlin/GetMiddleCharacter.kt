package org.example

class GetMiddleCharacter {
    fun getMiddle( word: String ): String{
        val wordLength = word.length
        if( word.isEmpty() )
            return ""
        else if( word.length % 2 == 0 )
            return "${ word[ wordLength / 2 - 1 ] }${ word[ wordLength / 2 ]}"
        else
            return word[wordLength / 2].toString()
    }
}
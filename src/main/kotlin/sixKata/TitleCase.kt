package org.example.sixKata

class TitleCase {
    fun titleCase( input: String, minors: String? = null ): String{
        val words = input.split(" ")
        val delimiters = minors?.split(" ").toString().lowercase()

        val string = StringBuilder()

        for( word in words ){
            if( word.lowercase() in delimiters ){
                string.append( word.lowercase() + " " )
            }
            else
                string.append( "${ word[0].uppercase() }${ word.substring( 1, word.length ).lowercase() } " )
        }

        return if( words[0].length == 1 )
            string.first().uppercase() + " " + string.substring( 1 ).trim()
        else
            string.first().uppercase() + string.substring( 1 ).trim()
    }
}
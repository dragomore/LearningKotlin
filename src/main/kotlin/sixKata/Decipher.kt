package org.example.sixKata

class Decipher {
    // the second and the last letter is switched (e.g. Hello becomes Holle)
    // the first letter is replaced by its character code (e.g. H becomes 72)
    fun decipher( str: String ): String = replaceCharacters( swapCharacters( getWordsList( str ) ) ).joinToString(" ")

    // Get list of words
    private fun getWordsList( str: String ): List<String>{
        return str.split(" ")
    }
    // Swap 2nd and last characters on each word
    private fun swapCharacters( list: List<String> ): List<String> {
        return list.map { word ->
            if ( word.length > 2 ) {
                val firstChar = word[ 0 ]
                val secondChar = word[ 1 ]
                val lastChar = word.last()
                val remainingChars = word.substring( 2, word.length - 1 )
                "$firstChar$lastChar$remainingChars$secondChar"
            } else {
                word
            }
        }
    }
    // Replace 1st character on the char-code on each word
    private fun replaceCharacters( list: List<String> ): List<String>{
        return list.map{
            it.let { word ->
                "${word[0].code}" + word.substring(1, word.length )
            }
        }
    }
}


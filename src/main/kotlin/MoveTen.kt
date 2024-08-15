package org.example

class MoveTen {
    fun moveTen( s: String ): String{
        val FIRST_CHAR_AT_CODE = 96
        val LAST_CHAR_AT_CODE = 122
        val NEXT_CHAR_STEP = 10

        var replacedChars = ""
        s.forEach { i ->
            val newPosition = i.code + NEXT_CHAR_STEP
            if( newPosition > LAST_CHAR_AT_CODE ) {
                replacedChars += ( FIRST_CHAR_AT_CODE + ( newPosition - LAST_CHAR_AT_CODE ) ).toChar()
            }
            else
                replacedChars += newPosition.toChar()
        }

        return replacedChars
    }
}
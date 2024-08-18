package org.example

class PassGen {
    fun generatePassword( length: Int ): String{
        val password = StringBuilder()
        while( password.length != length ){
            password.append( generateCharacter() )
        }

        return password.toString()
    }

    // function returns a random character: a..z or 0..9
    private fun generateCharacter(): Char{
        val isNumber = ( 0..1 ).random()

        if( isNumber == 0 )
            // false
            return ( CHAR_CODE_START until CHAR_CODE_END ).random().toChar()
        // true
        return ( NUMBERS_CODE_START until NUMBER_CODE_END ).random().toChar()
    }

    companion object {
        const val NUMBERS_CODE_START  = 48
        const val NUMBER_CODE_END     = 57
        const val CHAR_CODE_START     = 97
        const val CHAR_CODE_END       = 122
    }
}
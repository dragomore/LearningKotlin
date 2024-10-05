package org.example.sevenKata

class AlphaSeq {
    fun alphaSeq( str: String ): String {
        val charsList = str.map{ it.lowercase() }.sorted().toString().replace(regexToAll, "")

        val result: MutableList<String> = arrayListOf()
        val appendingString = StringBuilder()

        for( i in charsList ){
            val repeatQuantity = i.code - FIRST_CHAR_CODE
            if( repeatQuantity == 0 )
                appendingString.append( i.uppercase() )
            for( j in 0..< repeatQuantity ) {
                if( j == 0 )
                    appendingString.append( i.uppercase() )
                appendingString.append( i )
            }
            result.add( appendingString.toString() )
            appendingString.clear()
        }

        return result.toString().replace(regexToString, "" )
    }

    companion object{
        const val FIRST_CHAR_CODE = 97
        val regexToAll = "[,\\[\\]\\s]+".toRegex()
        val regexToString = "[\\[\\]\\s]+".toRegex()
    }
}
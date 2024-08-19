package org.example

class AlphaSeq {
    fun alphaSeq( str: String ): String {
        val charsList = str.map{ it.lowercase() }.sorted().toString().replace(regexToAll, "")
        val result: MutableList<String> = arrayListOf()
        val appendingString = StringBuilder()
        for( i in charsList ){
            val repeatQuantity = i.code - FIRST_CHAR_CODE
            for( j in 1..repeatQuantity ){
                if( j == 1 )
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
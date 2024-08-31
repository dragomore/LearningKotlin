package org.example.sixKata

class Catalog {
    fun catalog( s: String, article: String ): String {
        // List of separated strings
        val stringList = s
            .trim()
            .split("\n")
            .filter{ it.isNotEmpty() }
        // Strings that contains given article
        val filteredString = stringList.filter{ it.substringAfter( NAME_TAG_OPEN ).substringBefore( NAME_TAG_CLOSE ).contains( article ) }
            .toList()
        // If we have not included filter word in list - return Nothing
        if( filteredString.isEmpty() )
            return "Nothing"
        // Return string
        val returnString = StringBuilder()
        // Generating every string for output pattern
        for( ( step, i ) in filteredString.indices.withIndex() ){
            val name = filteredString[ i ].substringAfter( NAME_TAG_OPEN ).substringBefore( NAME_TAG_CLOSE )
            val price = filteredString[ i ].substringAfter( PRICE_TAG_OPEN ).substringBefore( PRICE_TAG_CLOSE )
            val qty = filteredString[ i ].substringAfter( QUANTITY_TAG_OPEN ).substringBefore( QUANTITY_TAG_CLOSE )
            if( step == filteredString.indices.count() - 1 )
                returnString.append( "$name > prx: $$price qty: $qty" )
            else
                returnString.append( "$name > prx: $$price qty: $qty\n" )
        }

        return returnString.toString()
    }

    companion object{
        const val NAME_TAG_OPEN = "<name>"
        const val NAME_TAG_CLOSE = "</name>"
        const val PRICE_TAG_OPEN = "<prx>"
        const val PRICE_TAG_CLOSE = "</prx>"
        const val QUANTITY_TAG_OPEN = "<qty>"
        const val QUANTITY_TAG_CLOSE = "</qty>"
    }
}
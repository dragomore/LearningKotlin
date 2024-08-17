package org.example

class AltCap {
    fun capitalize( text: String ): List<String> {
        val capitalizeEven = StringBuilder()
        text.mapIndexed { idx, char ->
            if( idx % 2 == 0 )
                capitalizeEven.append( char.uppercase() )
            else
                capitalizeEven.append( char )
        }
        val capitalizeOdd = StringBuilder()
        text.mapIndexed { idx, char ->
            if( idx % 2 != 0 )
                capitalizeOdd.append( char.uppercase() )
            else
                capitalizeOdd.append( char )
        }

        return listOf( capitalizeEven.toString() , capitalizeOdd.toString() )
    }
}
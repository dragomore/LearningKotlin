package org.example.sevenKata

class SplitString {
    fun splitString( string: String ): List<String>{
        if( string.isNotEmpty() ){
            val a = string.chunked(2).toMutableList()
            if( a.size % 2 == 0 ){
                val tmp = a.last()
                a.remove( tmp )
                a.add("${tmp}_")
            }
            return a
        }
        return listOf("")
    }
}
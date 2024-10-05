package org.example.sevenKata

class MirrorStrings {
    fun oper( function: ( String ) -> String , s: String): String = function( s )

    fun vertMirror( str: String ): String {
        return str.split("\n" )
            .map{ it.reversed() }
            .joinToString { it }
            .replace(" ", "" )
            .replace(",", "\n" )
    }
    fun horMirror( str: String ): String {
        return str.split("\n" )
            .reversed()
            .joinToString { it }
            .replace(" ","" )
            .replace(",", "\n" )
    }
}
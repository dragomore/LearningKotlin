package org.example

class TuringEquation {
    fun isTuringEquation( string: String ): Boolean{
        val newList = string.split(Regex("[^0-9]") )
            .map { it.reversed().toBigInteger() }

        return newList[0] + newList[1] == newList[2]
    }
}
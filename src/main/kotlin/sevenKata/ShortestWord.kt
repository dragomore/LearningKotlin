package org.example.sevenKata

class ShortestWord {
    fun findShort( string: String ): Int{
        val stringsLength = string.split(" ").map{ it.length }
        val min = stringsLength.min().toInt()

        return min
    }
}
package org.example

class VowelCount {
    fun getCount( str: String ): Int{
        val vowels = listOf("a", "e", "i", "o", "u")

        return str.replace(" ", "").map { it in vowels.toString() }.count{ it }
    }
}
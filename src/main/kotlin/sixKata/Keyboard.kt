package org.example.sixKata

class Keyboard {
    // ready solution
    fun findWords(words: Array<String>) = words.filter { word ->
        rows.any { it.containsAll(word.lowercase().toList()) }
    }
    private val rows = listOf("qwertyuiop", "asdfghjkl", "zxcvbnm").map { it.toList() }
}
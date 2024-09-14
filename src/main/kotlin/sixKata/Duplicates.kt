package org.example.sixKata

class Duplicates {
    fun duplicateCount(text: String): Int {
        val chars = text.lowercase().toSet()
        val charsCount = chars.associateWith { char ->
            text.lowercase().count{ it == char }
        }
            .filter { it.value >= 2 }

        return charsCount.count()
    }
}
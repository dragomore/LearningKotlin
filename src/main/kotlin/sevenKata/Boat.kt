package org.example.sevenKata

class Boat {
    fun fireFight(s: String): String =
        s.split(" ").joinToString(separator = " ") { it.replace("Fire", "~~") }
}
package org.example

class Boat {
    fun fireFight(s: String): String =
        s.split(" ").joinToString(separator = " ") { it.replace("Fire", "~~") }
}
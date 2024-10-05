package org.example.sevenKata

class SmallEnough {
    fun smallEnough( a : IntArray, limit : Int ): Boolean {
        a.forEach { i ->
            if( i > limit )
                return false
        }
        return true
    }
}
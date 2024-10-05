package org.example.sevenKata

import kotlin.math.sqrt

class PredictAge {
    fun predictAge( ages: List<Int> ): Int{
        val multiplyAges = ages.map{ it * it }
        val sumMultiplies = multiplyAges.sumOf{ it }
        val squareResultOfSum = sqrt( sumMultiplies.toDouble() ).toInt()

        return squareResultOfSum / 2
    }
}
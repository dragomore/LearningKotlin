package org.example

class Screen {
    fun findScreenHeight( width: Int, ratio: String ): String {
        val widthRatio = ratio.split(":").first().toInt()
        val heightRatio = ratio.split(":").last().toInt()

        return "${ width }x${ ( width * heightRatio ) / widthRatio }"
    }
}
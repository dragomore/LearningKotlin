package org.example.sixKata

class Rainfall {
    // Average precipitation for the city
    fun mean( town:String, data:String ): Double {
        // Get values of the month
        val townRainfallData = getRainfallValues( town, data )

        return townRainfallData.sumOf{ it.toDouble() } / MONTH
    }

    // Precipitation dispersion for the city
    fun variance( town:String, data:String ): Double {
        // Get values of the month
        val townRainfallData = getRainfallValues( town, data )
        // Arithmetic mean by months
        val arithmeticMean = townRainfallData.sumOf{ it.toDouble() } / MONTH
        // For each month, subtract the average from the rainfall for that month.
        val monthMinusMean = townRainfallData.map{ it.toDouble() - arithmeticMean }
        // Square each deviation
        val monthMinusMeanSqr = monthMinusMean.map{ it * it }

        // Find the arithmetic mean of squares of deviations
        return monthMinusMeanSqr.sumOf{ it } / MONTH
    }

    private fun getRainfallValues( town: String, data: String ): List<String>{
        return data.split("\n")
            .filter { it.contains( town ) }
            .toString()
            .replace( "[", "" )
            .replace( "]", "" )
            .substringAfter(":")
            .replace( Regex("[a-zA-Z]+"), "")
            .split(",")
    }

    companion object{
        const val MONTH = 12
    }
}
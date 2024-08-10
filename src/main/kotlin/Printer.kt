package org.example

class Printer {
    fun printerErrors( string: String ): String{
        val nonInclusiveValues = string.split(Regex("[a-m]",)).toString().replace(",","").replace(" ", "").trim().length - 2

        return "$nonInclusiveValues/${string.length}"
    }
}
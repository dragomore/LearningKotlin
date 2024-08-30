package org.example.sixKata

class CheckBook {
    // Function that round number to format #.##
    private fun formatRounded(balance: Double) = String.format("%.2f", balance)

    fun balance( book: String ): String {
        val answer: StringBuilder = StringBuilder()

        // Regex
        val regex = "[?!=:;,{}]+".toRegex()
        val categoryRegex = "[^a-zA-Z]+".toRegex()
        // New string cleaned from other symbols
        val stringsList = book.replace( regex, "" )
            .trim()
            .split("\n")

        // Total balance val
        var balance = stringsList.first().toDouble()
        val TOTAL_BALANCE = stringsList.first().toDouble()
        // First string in answer
        answer.append( "Original Balance: ${formatRounded( balance ).replace(',', '.') }" )

        for( line in stringsList.drop(1) ){
            // Getting ID, Category, Check Amount from String
            val id = line.substringBefore(" ").trim()
            val category = line.replace( categoryRegex, "").trim()
            val checkAmount = line.trim().substringAfterLast(" ").toDouble()
            // Calculate difference
            balance -= checkAmount
            // Append new string to answer
            val string = "\n$id $category ${ formatRounded( checkAmount ).replace(',', '.') } Balance ${ formatRounded( balance ).replace(',', '.') }"
            answer.append( string )
        }

        // Append totals to answer
        val totalExpense = TOTAL_BALANCE - balance
        val values = stringsList.size - 1
        answer.append( "\nTotal expense  ${ formatRounded( totalExpense ).replace(',', '.') }" )
        answer.append( "\nAverage expense  ${ formatRounded( totalExpense / values ).replace(',', '.') }" )

        return answer.toString()
    }
}
// https://www.codewars.com/kata/59d727d40e8c9dd2dd00009f/train/kotlin
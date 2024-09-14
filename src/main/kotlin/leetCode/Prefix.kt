package org.example.leetCode

class Prefix {
    fun longestCommonPrefix( strings: Array<String>): String {
        // Get word with minimum chars
        val minimumLength = strings.minOfOrNull { it.length }
        val minimumLengthStr = strings.first { it.length == minimumLength }
        // Max prefix
        val prefix = StringBuilder()

        for( idx in minimumLengthStr.indices ){
            var contains = false
            for( str in strings ){
                contains = str[idx] == minimumLengthStr[idx]
                if( !contains )
                    break
            }
            if( contains )
                prefix.append( minimumLengthStr[idx] )
            if( !contains )
                break
        }

        return prefix.toString()
    }
}
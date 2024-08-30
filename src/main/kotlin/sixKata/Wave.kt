package org.example.sixKata

class Wave {
    fun wave( str: String ): List<String> {
        val a = str.withIndex()
            .filter { ( _, c ) -> !c.isWhitespace() }
            .map { ( index, c ) ->
                str.replaceRange(index, index + 1, c.uppercase() )
            }
            .toList()

        return a
    }
}
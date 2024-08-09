package org.example

class MyLanguages {
    fun myLanguages( results: Map<String, Int> ): List<String>{
        if( results.isEmpty() )
            return listOf()

        return results.filter { ( _, value ) -> value >= 60 }
            .toSortedMap()
            .map{ ( _,value ) -> value }
            .sortedDescending()
            .map{ i -> results.filterValues { it == i }.keys }
            .flatten()
            .toList()
    }
}
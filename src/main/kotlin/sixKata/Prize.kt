package org.example.sixKata

class Prize {

    fun nthRank( st: String, we: IntArray, n: Int ): String {
        val participantsCount = st.split(',' )
            .count()

        if( st.isEmpty() )
            return EMPTY_STRING_ERR
        if( n > participantsCount )
            return NOT_ENOUGH_PARTICIPANTS_ERR

//        val participantsList = st.split(',' )
//        val participantsMap: MutableMap<String, Int> = mutableMapOf()
//        participantsList.forEach{ str ->
//            participantsMap[ str ] = str.length + getSurnameScore( str )
//        }
//        println( participantsMap )
//        val sortedParticipantsValues = participantsMap
//            .values
//            .sortedDescending()
//        println("Sorted values: $sortedParticipantsValues")
//        val a = participantsMap.filterValues { it == sortedParticipantsValues[ we[ n + 1 ] - 1 ] }
//        println( a )

//        return participantsMap.filterValues { it == sortedParticipantsValues[ we[ n + 1 ] - 1 ] }
//            .keys.toString()
//            .replace("[", "")
//            .replace("]", "")

        val names = st.split(',')
        return names.mapIndexed { i, name ->
            val sum = name.lowercase()
                .sumOf { it.code - 96 }
            Pair( name, ( sum + name.count() ) * we[ i ] )
        }.sortedWith( compareBy( { -it.second }, { it.first.lowercase() } ) )[ n - 1 ].first
    }

//     private fun getSurnameScore( firstname: String ): Int{
//        return firstname.lowercase()
//            .sumOf{ it.code - 96 }
//    }

    companion object{
        const val EMPTY_STRING_ERR = "No participants"
        const val NOT_ENOUGH_PARTICIPANTS_ERR = "Not enough participants"
    }
}
/*        val b = participantsMap
            .values
            .sorted()
            .chunked( 2 )
        println( b )
        val a = participantsMap
            .values
            .asSequence()
            .sorted()
            .chunked( 2 )
            .filter{ it.size == 2}
            .map { pair -> pair.all { it == pair.first() } }
            .filter{ it }
           .toList()
      println( a )
              val repeatingKey = participantsMap
            .values
            .sortedDescending()
            .groupBy { it }
            .filterValues { it.size > 1 }
            .keys
            .toList()
        val sortedParticipants = participantsMap
            .keys
            .sortedDescending()
        val repeatedFirstnames = repeatingKey.map{ key ->
            participantsMap.filter{ it.value == key }.keys }
            .flatten()
            .sorted()
 */
package org.example

class OfficeMood {
    fun outed( meet: Map<String, Int>, boss: String ): String{
        val bossHappiness = meet[boss]
        var avgHappiness = 0
        val membersOnMeet = meet.size
        meet.forEach{ i -> avgHappiness += i.value }
        avgHappiness = ( avgHappiness + bossHappiness!! ) / membersOnMeet

        if( avgHappiness <= 5 )
            return "Get Out Now!"
        return "Nice Work Champ!"
    }
}
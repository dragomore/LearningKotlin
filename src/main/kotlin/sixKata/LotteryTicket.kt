package org.example.sixKata

class LotteryTicket {
    fun bingo( ticket: Array<Pair<String, Int>>, win: Int ): String {
        val a = ticket.count{ ( str, value ) -> str.any{ char -> char.code == value } }

        if( a >= win )
            return "Winner!"
        return "Loser!"
    }
}
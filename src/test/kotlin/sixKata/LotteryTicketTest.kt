package sixKata

import org.example.sixKata.LotteryTicket
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LotteryTicketTest {

    @Test
    fun bingo() {
        val foo = LotteryTicket()
        val bingo = foo::bingo

        assertEquals("Loser!", bingo( arrayOf( "ABC" to 65, "HGR" to 74, "BYHT" to 74 ), 2) )
//        assertEquals("Winner!", bingo( arrayOf( "ABC" to 65, "HGR" to 74, "BYHT" to 74 ), 1) )
//        assertEquals("Loser!", bingo( arrayOf( "HGTYRE" to 74, "BE" to 66, "JKTY" to 74 ), 3) )
    }
}
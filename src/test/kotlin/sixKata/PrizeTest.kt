package sixKata

import org.example.sixKata.Prize
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PrizeTest {

    @Test
    fun nthRank() {
        val foo = Prize()
        val nthRank = foo::nthRank

        assertEquals( "No participants", nthRank( "", intArrayOf(4, 2, 1, 4, 3, 1, 2), 4 ) )
        assertEquals( "Not enough participants", nthRank( "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", intArrayOf(4, 2, 1, 4, 3, 1, 2), 8 ) )
        assertEquals( "Benjamin", nthRank( "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", intArrayOf(4, 2, 1, 4, 3, 1, 2), 4 ) )
        assertEquals( "Matthew", nthRank( "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden", intArrayOf(1, 3, 5, 5, 3, 6, 1), 2 ) )
    }

}
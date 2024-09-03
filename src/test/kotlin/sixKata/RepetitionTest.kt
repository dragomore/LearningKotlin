package sixKata

import org.example.sixKata.Repetition
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RepetitionTest {

    @Test
    fun longestRepetition() {
        val foo = Repetition()
        val longestRepetition = foo::longestRepetition

        assertEquals( Pair( 'a', 4 ), longestRepetition( "aaaabb" ) )
        assertEquals( Pair( 'a', 4 ), longestRepetition( "bbbaaabaaaa" ) )
        assertEquals( Pair( 'u', 3 ), longestRepetition( "cbdeuuu900" ) )
        assertEquals( Pair( 'b', 5 ), longestRepetition( "abbbbb" ) )
        assertEquals( Pair( 'a', 2 ), longestRepetition( "aabb" ) )
        assertEquals( Pair( null, 0 ), longestRepetition( "" ) )
    }
}
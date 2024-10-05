import org.example.sevenKata.ShortestWord
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ShortestWordTest {

    @Test
    fun findShort() {
        val foo = ShortestWord()
        val findShort = foo::findShort

        assertEquals( 3, findShort( "String about nature two" ) )
        assertEquals( 1, findShort( "Today i wash my cloth" ) )
        assertEquals( 9, findShort( "Wednesday Wednesdayyyyy" ) )
        assertEquals( 0, findShort( " " ) )
    }
}
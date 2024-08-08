import org.example.SplitString
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SplitStringTest {

    @Test
    fun splitString() {
        val foo = SplitString()
        val splitString = foo::splitString

        assertEquals( listOf("ab", "cd", "ef"), splitString( "abcdef" ) )
        assertEquals( listOf("ab", "cd", "ef", "g_"), splitString("abcdefg") )
        assertEquals( listOf(""), splitString("") )
    }
}
package sixKata

import org.example.sixKata.Keyboard
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class KeyboardTest {

    @Test
    fun findWords() {
        val foo = Keyboard()
        val findWords = foo::findWords

        assertEquals( listOf( "Alaska","Dad" ), findWords( arrayOf( "Hello","Alaska","Dad","Peace" ) ) )
        assertEquals( emptyList<String>(), findWords( arrayOf( "omk" ) ) )
        assertEquals( listOf( "adsdf","sfd" ), findWords( arrayOf( "adsdf","sfd" ) ) )
    }
}
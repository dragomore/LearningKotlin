package sixKata

import org.example.sixKata.Decipher
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class DecipherTest {

    @Test
    fun decipher() {
        val foo = Decipher()
        val decipher = foo::decipher

        assertEquals("72olle 103doo 100ya", decipher( "Hello good day" ) )
        assertEquals("82yade 115te 103o", decipher( "Ready set go" ) )
        assertEquals("72eva 97 103o 97t 116sih 97dn 115ee 104wo 121uo 100o", decipher( "Have a go at this and see how you do" ) )
        assertEquals("65 119esi 111dl 111lw 108dvei 105n 97n 111ka",decipher( "A wise old owl lived in an oak" ) )
        assertEquals("84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp", decipher( "The more he saw the less he spoke" ) )
        assertEquals("84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare", decipher( "The less he spoke the more he heard" ) )
        assertEquals("87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri", decipher( "Why can we not all be like that wise old bird" ) )
        assertEquals("84kanh 121uo 80roti 102ro 97ll 121ruo 104ple", decipher( "Thank you Piotr for all your help" ) )
    }
}
import org.example.AlphabetWar
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AlphabetWarTest {

    @Test
    fun alphabetWar() {
        val foo = AlphabetWar()
        val alphabetWar = foo::alphabetWar

        assertEquals("Right side wins!", alphabetWar("z"))
        assertEquals("Let's fight again!", alphabetWar("zdqmwpbs"))
        assertEquals("Right side wins!", alphabetWar("zzzzs"))
        assertEquals("Left side wins!", alphabetWar("wwwwww"))
    }
}
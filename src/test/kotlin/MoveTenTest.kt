import org.example.MoveTen
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MoveTenTest {

    @Test
    fun moveTen() {
        val foo = MoveTen()
        val moveTen = foo::moveTen

        assertEquals("docdmkco", moveTen("testcase") )
        assertEquals("mynogkbc", moveTen("codewars") )
        assertEquals("ohkwzvodocdrobo", moveTen("exampletesthere") )
    }
}
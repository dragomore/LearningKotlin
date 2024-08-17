import org.example.CatAndMouse
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CatAndMouseTest {

    @Test
    fun catMouse() {
        val foo = CatAndMouse()
        val catMouse = foo::catMouse

        assertEquals("Escaped!", catMouse("C....m"))
        assertEquals("Caught!", catMouse("C..m"))
        assertEquals("Escaped!", catMouse("C.....m"))
        assertEquals("Caught!", catMouse("C.m"))
    }
}
import org.example.GetMiddleCharacter
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GetMiddleCharacterTest {

    @Test
    fun getMiddle() {
        val foo = GetMiddleCharacter()
        val getMiddle = foo::getMiddle

        assertEquals("es", getMiddle("test"))
        assertEquals("dd", getMiddle("middle"))
        assertEquals("t", getMiddle("testing"))
        assertEquals("A", getMiddle("A"))
        assertEquals("", getMiddle(""))
    }
}
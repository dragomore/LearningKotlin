import org.example.AltCap
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AltCapTest {

    @Test
    fun capitalize() {
        val foo = AltCap()
        val capitalize = foo::capitalize

        assertEquals(listOf("AbCdEf", "aBcDeF"), capitalize("abcdef"))
        assertEquals(listOf("CoDeWaRs", "cOdEwArS"), capitalize("codewars"))
        assertEquals(listOf("AbRaCaDaBrA", "aBrAcAdAbRa"), capitalize("abracadabra"))
        assertEquals(listOf("CoDeWaRrIoRs", "cOdEwArRiOrS"), capitalize("codewarriors"))
    }
}
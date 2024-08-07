import org.example.TuringEquation
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TuringEquationTest {

    @Test
    fun isTuringEquation() {
        val foo = TuringEquation()
        val isTuringEquation = foo::isTuringEquation

        assertEquals(false, isTuringEquation("73+42=16"))
        assertEquals(false, isTuringEquation("5+8=13"))
        assertEquals(true, isTuringEquation("10+20=30"))
        assertEquals(true, isTuringEquation("0001000+000200=00030"))
        assertEquals(false, isTuringEquation("1234+5=1239"))
        assertEquals(false, isTuringEquation("71+0=0"))
        assertEquals(true, isTuringEquation("7000+8000=51"))
        assertEquals(true, isTuringEquation("0+0=0"))
        assertEquals(true, isTuringEquation("123720622+211286352=334907974"))
        assertEquals(true, isTuringEquation("00620920+0081281=0044274000000000"))
    }

//    private fun isTuringEquation(string: String): Boolean {
//        val newList = string.split(Regex("[^0-9]") )
//            .map { it.reversed().toBigInteger() }
//
//        return newList[0] + newList[1] == newList[2]
//    }
}
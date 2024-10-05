import org.example.sevenKata.PredictAge
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PredictAgeTest {

    @Test
    fun predictAge() {
        val foo = PredictAge()
        val predictAge = foo::predictAge

        assertEquals(86, predictAge( listOf( 65, 60, 75, 55, 60, 63, 64, 45 ) ) )
        assertEquals(79, predictAge( listOf( 32, 54, 76, 65, 34, 63, 64, 45 ) ) )
    }
}
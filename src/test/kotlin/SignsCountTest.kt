import org.example.SignsCount
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SignsCountTest {

    @Test
    fun catchSignChange() {
        val foo = SignsCount()
        val catchSignChange = foo::catchSignChange

        assertEquals(0, catchSignChange( arrayOf( 1, 3, 4, 5 ) ) )
        assertEquals(0, catchSignChange( arrayOf<Int>() ) )
        assertEquals(2, catchSignChange( arrayOf( 1, -3, -4, 0, 5 ) ) )
        assertEquals(3, catchSignChange( arrayOf( -47, 84, -30, -11, -5, 74, 77 ) ) )

    }
}
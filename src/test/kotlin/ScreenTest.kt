import org.example.sevenKata.Screen
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ScreenTest {

    @Test
    fun findScreenHeight() {
        val foo = Screen()
        val findScreenHeight = foo::findScreenHeight

        assertEquals("1024x768", findScreenHeight(1024,"4:3"))
        assertEquals("1280x720", findScreenHeight(1280,"16:9"))
        assertEquals("3840x1080", findScreenHeight(3840,"32:9"))
    }
}
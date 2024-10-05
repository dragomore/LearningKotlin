import org.example.sevenKata.SwearFilter
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SwearFilterTest {

    @Test
    fun swearFilter() {
        val filterInstance = SwearFilter()
        val filter = filterInstance::filter

        assertEquals( "Мама мыла сына", filter( "Мама мыла раму", listOf("раму", "папу", "попу"), "сына") )
        assertEquals( "Всем приветы", filter("Всем приветы хуеветы", listOf("хуеветы", "пиво", "дота"), null ) )
    }
}
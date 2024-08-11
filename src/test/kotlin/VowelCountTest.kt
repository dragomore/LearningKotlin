import org.example.VowelCount
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class VowelCountTest {

    @Test
    fun getCount() {
        val foo = VowelCount()
        val getCount = foo::getCount

        assertEquals(5, getCount("abracadabra"))
        assertEquals(1, getCount("test"))
        assertEquals(3, getCount("example"))
        assertEquals(11, getCount("kfewdyaceollfiglgjzexhriiwjstmfoqzjfzmqzizin"))
        assertEquals(4, getCount("pear tree"))
    }
}
package sixKata

import org.example.sixKata.Duplicates
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class DuplicatesTest {

    @Test
    fun duplicateCount() {
        val foo = Duplicates()
        val duplicateCount = foo::duplicateCount

        assertEquals(0, duplicateCount("abcde" ) )
        assertEquals(1, duplicateCount("abcdea" ) )
        assertEquals(1, duplicateCount("indivisibility" ) )
        val text = "dA" + "c".repeat(10) + "b".repeat(100) + "a".repeat(1000)
        assertEquals(3, duplicateCount( text ) )
        assertEquals( 34, duplicateCount( "zLv05V7Af6iou5qO9L1a7cgAHv7Sw7fi0iX24kR1FqLQbxnIb2S27llpALgv62G95Gjs0UGS7ndmJ67s0udn5300Z5mV7GiuzfS4zrwo0BMRs0emOmGimfR5wky1aFolv57kjPdafQrCb8Pi2vKRnBtG2Cr6U47oq6zC8nC3fos1amaMIqyonl56msqlCHZGmiDALRs" ) )
    }
}
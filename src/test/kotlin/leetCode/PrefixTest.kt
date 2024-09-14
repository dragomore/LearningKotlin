package leetCode

import org.example.leetCode.Prefix
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PrefixTest {

    @Test
    fun longestCommonPrefix() {
        val foo = Prefix()
        val longestCommonPrefix = foo::longestCommonPrefix

//        assertEquals( "fl", longestCommonPrefix( arrayOf( "flower", "flow", "flight" ) ) )
//        assertEquals( "", longestCommonPrefix( arrayOf( "dog", "racecar", "car" ) ) )
//        assertEquals( "c", longestCommonPrefix( arrayOf( "cir","car" ) ) )
        assertEquals("", longestCommonPrefix( arrayOf( "reflower","flow","flight" ) ) )
    }
}
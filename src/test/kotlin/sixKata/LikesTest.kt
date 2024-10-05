package sixKata

import org.example.sixKata.Likes
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LikesTest {

    @Test
    fun whoLikesIt() {
        val foo = Likes()
        val whoLikesIt = foo::whoLikesIt

        assertEquals("no one likes this", whoLikesIt( arrayOf() ) )
        assertEquals("Peter likes this", whoLikesIt( arrayOf( "Peter" ) ) )
        assertEquals("Jacob and Alex like this", whoLikesIt( arrayOf( "Jacob", "Alex" ) ) )
        assertEquals("Max, John and Mark like this", whoLikesIt (arrayOf( "Max", "John", "Mark" ) ) )
        assertEquals("Alex, Jacob and 2 others like this", whoLikesIt( arrayOf( "Alex", "Jacob", "Mark", "Max" ) ) )
    }
}
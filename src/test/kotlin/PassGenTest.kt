import org.example.sevenKata.PassGen
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PassGenTest {

    @Test
    fun generatePassword() {
        val foo = PassGen()
        val generatePassword = foo::generatePassword

        assertEquals( 12, generatePassword( 12 ).length )
        assertEquals( 10, generatePassword( 10 ).length )

        var isPasswordContainsOtherChars = false
        val regex = Regex("[a-z0-9]+")
        val pass = generatePassword( 35 )
        if( !regex.matches( pass ) )
            isPasswordContainsOtherChars = true
        assertFalse( isPasswordContainsOtherChars )

        assertTrue( pass.isNotEmpty() )
    }
}
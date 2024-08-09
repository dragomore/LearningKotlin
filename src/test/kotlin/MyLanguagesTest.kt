import org.example.MyLanguages
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MyLanguagesTest {

    @Test
    fun myLanguages() {
        val foo = MyLanguages()
        val myLanguages = foo::myLanguages

        assertEquals( listOf("Ruby", "Python"), myLanguages( mapOf( "Java" to 10, "Ruby" to 80, "Python" to 65 ) ) )
        assertEquals( listOf("Dutch", "Greek", "Hindi"), myLanguages( mapOf( "Hindi" to 60, "Dutch" to 93, "Greek" to 71 ) ) )
        assertEquals( emptyList<String>(), myLanguages( mapOf( "C++" to 50, "AMS" to 10, "Haskell" to 20 ) ) )
        assertEquals( emptyList<String>(), myLanguages( emptyMap() ))
    }
}

/*
{"Java" => 10, "Ruby" => 80, "Python" => 65}   -->  ["Ruby", "Python"]
{"Hindi" => 60, "Dutch" => 93, "Greek" => 71}  -->  ["Dutch", "Greek", "Hindi"]
{"C++" => 50, "ASM" => 10, "Haskell" => 20}    -->  []
 */
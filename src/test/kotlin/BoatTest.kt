import org.example.Boat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class BoatTest {

    @Test
    fun fireFight() {
        val foo = Boat()
        val fireFight = foo::fireFight

        assertEquals("Boat Rudder Mast Boat Hull Water ~~ Boat Deck Hull ~~ Propeller Deck ~~ Deck Boat Mast", fireFight("Boat Rudder Mast Boat Hull Water Fire Boat Deck Hull Fire Propeller Deck Fire Deck Boat Mast"))
        assertEquals("Mast Deck Engine Water ~~", fireFight("Mast Deck Engine Water Fire"))
        assertEquals("~~ Deck Engine Sail Deck ~~ ~~ ~~ Rudder ~~ Boat ~~ ~~ Captain", fireFight("Fire Deck Engine Sail Deck Fire Fire Fire Rudder Fire Boat Fire Fire Captain"))
    }
}
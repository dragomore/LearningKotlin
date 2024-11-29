package sixKata

import org.example.sixKata.TitleCase
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
class TitleCaseTest {

 @Test
 fun titleCase() {
  val foo = TitleCase()
  val titleCase = foo::titleCase

  assertEquals( "A Clash of Kings", titleCase( "a clash of KINGS", "a an the of" ) )
  assertEquals( "The Wind in the Willows", titleCase( "THE WIND IN THE WILLOWS", "The In" ) )
  assertEquals( "The Quick Brown Fox", titleCase( "the quick brown fox", null ) )
 }
}
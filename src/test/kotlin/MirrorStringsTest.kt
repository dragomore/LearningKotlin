import org.example.MirrorStrings
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MirrorStringsTest {

    @Test
    fun vertMirror() {
        val foo = MirrorStrings()
        val vertMirror = foo::vertMirror

        assertEquals( "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw", vertMirror( "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu" ) )
        assertEquals( "EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP", vertMirror( "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx" ) )
    }

    @Test
    fun horMirror() {
        val foo = MirrorStrings()
        val horMirror = foo::horMirror

        assertEquals( "yeCt\nCSbg\nJVhv\nlVHt", horMirror( "lVHt\nJVhv\nCSbg\nyeCt" ) )
        assertEquals( "cEYz\nLPKo\ndbrZ\nnjMK", horMirror( "njMK\ndbrZ\nLPKo\ncEYz" ) )
    }

    private fun testing(actual: String, expected: String) {
        assertEquals(expected, actual)
    }
    @Test
    fun test() {
        val foo = MirrorStrings()

        println("Fixed Tests vertMirror")
        var s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu"
        var r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw"
        testing(foo.oper(foo::vertMirror, s), r)
        s = "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx"
        r = "EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP"
        testing(foo.oper(foo::vertMirror, s), r)

        println("Fixed Tests horMirror")
        s = "lVHt\nJVhv\nCSbg\nyeCt"
        r = "yeCt\nCSbg\nJVhv\nlVHt"
        testing(foo.oper(foo::horMirror, s), r)
        s = "njMK\ndbrZ\nLPKo\ncEYz"
        r = "cEYz\nLPKo\ndbrZ\nnjMK"
        testing(foo.oper(foo::horMirror, s), r)
    }
}
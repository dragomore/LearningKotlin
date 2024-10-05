import org.example.sevenKata.AlphaSeq
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AlphaSeqTest {

    @Test
    fun alphaSeq() {
        val foo = AlphaSeq()
        val alphaSeq = foo::alphaSeq

        assertEquals("A,Bb,Bb,Iiiiiiiii,Llllllllllll,Llllllllllll,Mmmmmmmmmmmmm,Mmmmmmmmmmmmm,Ooooooooooooooo,Pppppppppppppppp,Qqqqqqqqqqqqqqqqq,Tttttttttttttttttttt,Tttttttttttttttttttt,Vvvvvvvvvvvvvvvvvvvvvv,Wwwwwwwwwwwwwwwwwwwwwww,Wwwwwwwwwwwwwwwwwwwwwww,Wwwwwwwwwwwwwwwwwwwwwww,Wwwwwwwwwwwwwwwwwwwwwww,Zzzzzzzzzzzzzzzzzzzzzzzzzz", alphaSeq("QZWALwowWvlPtbmtmBi"))
        assertEquals("Eeeee,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Nnnnnnnnnnnnnn,Pppppppppppppppp,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Uuuuuuuuuuuuuuuuuuuuu,Xxxxxxxxxxxxxxxxxxxxxxxx,Zzzzzzzzzzzzzzzzzzzzzzzzzz", alphaSeq("ZpglnRxqenU"))
        assertEquals("Bb,Eeeee,Ffffff,Ffffff,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Sssssssssssssssssss,Yyyyyyyyyyyyyyyyyyyyyyyyy,Yyyyyyyyyyyyyyyyyyyyyyyyy,Yyyyyyyyyyyyyyyyyyyyyyyyy", alphaSeq("NyffsGeyylB"))
        assertEquals("Bb,Jjjjjjjjjj,Kkkkkkkkkkk,Mmmmmmmmmmmmm,Ooooooooooooooo,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Tttttttttttttttttttt,Uuuuuuuuuuuuuuuuuuuuu,Uuuuuuuuuuuuuuuuuuuuu,Vvvvvvvvvvvvvvvvvvvvvv", alphaSeq("MjtkuBovqrU"))
        assertEquals("Dddd,Eeeee,Iiiiiiiii,Jjjjjjjjjj,Kkkkkkkkkkk,Mmmmmmmmmmmmm,Mmmmmmmmmmmmm,Nnnnnnnnnnnnnn,Ooooooooooooooo,Uuuuuuuuuuuuuuuuuuuuu,Vvvvvvvvvvvvvvvvvvvvvv", alphaSeq("EvidjUnokmM"))
        assertEquals("Bb,Bb,Ccc,Ccc,Dddd,Eeeee,Hhhhhhhh,Iiiiiiiii,Nnnnnnnnnnnnnn,Vvvvvvvvvvvvvvvvvvvvvv,Xxxxxxxxxxxxxxxxxxxxxxxx", alphaSeq("HbideVbxncC"))
    }
}
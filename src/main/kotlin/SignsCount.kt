package org.example

class SignsCount {
    fun catchSignChange(arr: Array<Int>): Int {
        if( arr.isEmpty() )
            return 0

        var signs = 0
        arr.toList().zipWithNext{ current, next ->
            val isSignChanges = ( current < 0 && next >= 0 ) || ( current >= 0 && next < 0 )

            if( isSignChanges )
                signs++
        }

        return signs
    }

}
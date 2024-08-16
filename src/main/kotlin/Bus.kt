package org.example

class Bus {
    fun people( busStops: Array<Pair<Int, Int>> ) : Int =
        busStops.sumOf{ ( enter, out ) -> enter - out }
}
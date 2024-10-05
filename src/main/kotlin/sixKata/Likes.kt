package org.example.sixKata

class Likes {
    fun whoLikesIt( names: Array<String> ) : String {
        if( names.isEmpty() )
            return "no one likes this"

        return when( names.size ){
            1 -> {
                "${names[0]} likes this"
            }

            2 -> {
                "${names[0]} and ${names[1]} like this"
            }

            3 -> {
                "${names[0]}, ${names[1]} and ${names[2]} like this"
            }

            else -> {
                "${names[0]}, ${names[1]} and ${names.size - 2} others like this"
            }
        }
    }
}
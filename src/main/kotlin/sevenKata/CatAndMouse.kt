package org.example.sevenKata

class CatAndMouse {
    fun catMouse( s: String ): String {
        val dots = s.count { it == '.'  }

        if( dots < 3 )
            return "Caught!"
        return "Escaped!"
    }
}
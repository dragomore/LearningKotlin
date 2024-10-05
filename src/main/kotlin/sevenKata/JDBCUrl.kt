package org.example.sevenKata

class JDBCUrl {
    fun hidePasswordFromConnection( urlString: String ): String{
        val inputPass = urlString.substringAfterLast("password=").replace( Regex("&.*" ), "" )
        var passMask = ""
        inputPass.forEach { _ -> passMask += "*" }

        return urlString.replace( inputPass, passMask )
    }
}
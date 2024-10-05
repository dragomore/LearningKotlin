package org.example.sevenKata

class AltCap {
    fun capitalize( text: String ): List<String> =  listOf( capitalizeLetters( text, "even") , capitalizeLetters( text, "odd") )

    private fun capitalizeLetters( str: String, method: String ): String{
        val capitalizedString = StringBuilder()
        when( method ){
            "even" -> {
                str.mapIndexed { idx, char ->
                    if( idx % 2 == 0 )
                        capitalizedString.append( char.uppercase() )
                    else
                        capitalizedString.append( char )
                }
            }
            "odd" -> {
                str.mapIndexed { idx, char ->
                    if( idx % 2 != 0 )
                        capitalizedString.append( char.uppercase() )
                    else
                        capitalizedString.append( char )
                }
            }
        }

        return capitalizedString.toString()
    }
}
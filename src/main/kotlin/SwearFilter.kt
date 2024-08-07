package org.example

class SwearFilter {
    fun filter(sentence: String, dictionary: List<Any>, replaceWith: String?): String{
        return sentence.split(" ").joinToString(" ") { word ->
            if (word in dictionary)
                replaceWith ?: "" else word
        }.trim()
    }
}
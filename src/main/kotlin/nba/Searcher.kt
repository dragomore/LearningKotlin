package org.example.nba

class Searcher {
    private val genresList: List< Pair< String, Boolean > > = listOf(
        "Fantasy" to false,
        "Horror" to true,
        "Melody" to false,
        "Melody" to true,
        "Melody" to false,
        "Horror" to false,
        "Melody" to true,
        "Horror" to true,
        "Fantasy" to true,
        "Fantastic" to true,
        "Fantastic" to true,
        "Fantasy" to false,
        "Melody" to false,
        "Melody" to true,
        "Horror" to false,
        "Melody" to false,
        "Fantasy" to true,
        "Melody" to false,
        "Fantasy" to false,
        "Melody" to false,
        "Melody" to true,
        "Melody" to true,
        "Fantasy" to false,
        "Melody" to true
    )
    // Sum of Views: Yes & No
    private val viewsTotalTrue = findGenreTrue().values.sum().toDouble()
    private val viewsTotalFalse = findGenreFalse().values.sum().toDouble()
    // Total Views
    private val totalViews: Double = viewsTotalFalse + viewsTotalTrue

    // Chances of Views: Yes & No
    private val yesViewChance = viewsTotalTrue / totalViews
    private val noViewChance = viewsTotalFalse / viewsTotalTrue

    // Chance to view genre: Fantasy
    private val fantasyChance = ( findGenreTrue()[ "Fantasy" ]?.toDouble()?.plus( findGenreFalse()[ "Fantasy" ]?.toDouble()!! ) )?.div( totalViews )
    // Chance to view genre: Horror
    private val horrorChance = ( findGenreTrue()[ "Horror" ]?.toDouble()?.plus( findGenreFalse()[ "Horror" ]?.toDouble()!! ) )?.div( totalViews )
    // Chance to view genre: Melody
    private val melodyChance = ( findGenreTrue()[ "Melody" ]?.toDouble()?.plus( findGenreFalse()[ "Melody" ]?.toDouble()!! ) )?.div( totalViews )
    // Chance to view genre: Fantastic
    private val fantasticChance = ( findGenreTrue()[ "Fantastic" ]?.toDouble()?.plus( findGenreFalse()[ "Fantastic" ]?.toDouble()!! ) )?.div( totalViews )

    // P( Horror | Yes )
    private val horrorYes = findGenreTrue()[ "Horror" ]?.div( yesViewChance )
    // P( Horror ) = val horrorChance
    // P( Yes ) = val yesViewChance
    // P( Yes | Horror )
    private val answer = horrorYes?.times( ( horrorChance?.div( yesViewChance )!! ) )

    private fun findGenreTrue(): Map<String, Int>{
        return genresList.groupBy { it.first }
            .mapValues { (_, values) -> values.count { it.second } }
    }
    private fun findGenreFalse(): Map<String, Int>{
        return genresList.groupBy { it.first }
            .mapValues { (_, values) -> values.count { !it.second } }
    }

    fun getHorrorViewChance(){
        println( "Найти вероятность того, что мы будем смотреть Хоррор:")
        println("P( Horror | Yes ) = $horrorYes \n" +
                "P( Horror ) = $horrorChance \n" +
                "P( Yes ) = $yesViewChance \n" +
                "P( Yes | Horror ) = $answer" )
    }
}
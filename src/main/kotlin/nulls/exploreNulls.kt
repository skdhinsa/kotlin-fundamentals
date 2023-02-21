package nulls

data class Movie (
    val id: Int?,
    val name: String
)

fun main() {
    var nameNullable: String? = null
//    if(nameNullable != null) {
//        println( nameNullable.length)
//    }
    //null check
    println("value is: ${nameNullable?.length}") //safe operator, ?

    val length = nameNullable?.length ?: 0 // elvis operator, default value if null, ?:
    println("length of $nameNullable is $length")

    nameNullable = "Serena"
    println("length of $nameNullable is $length")

    var nameNonNullable: String = "Sophie"
    val comedy = Movie(null, "funny film")
    val thriller = Movie(1, "thriller film")
    val savedMovie = saveMovie(comedy)
    println("movie id is not null: ${savedMovie.id!!}") // not null assertion. NPE if value is null
    println(comedy)
    println(savedMovie)
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id=4)
}

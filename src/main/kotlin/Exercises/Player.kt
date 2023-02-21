package Exercises

class Player (
    val firstName: String,
    val lastName: String
    )
{
    var totalScore: Double = 0.0
    var personalBestScore: Double = 0.0

    fun fullName(): String{
        return this.firstName+ " "+ this.lastName
    }
}
package Exercises

fun main() {

    val p1 = Player("Lara", "Croft")
    val p2 = Player("Jean", "Grey")
    val scoring = Scores()
    var lvlScore = 0.0
    println("Start game score: "+p1.totalScore)

    lvlScore = 20.0
    p1.personalBestScore = scoring.checkIfNewPersonalBest(p1.personalBestScore, p1.totalScore)
    p1.totalScore += lvlScore

    println("Level 1 score: "+p1.totalScore)

    lvlScore = 35.0
    p1.personalBestScore = scoring.checkIfNewPersonalBest(p1.personalBestScore, p1.totalScore)
    p1.totalScore += lvlScore
    println("Level 2 score: "+p1.totalScore)


    lvlScore = 25.0
    p1.personalBestScore = scoring.checkIfNewPersonalBest(p1.personalBestScore, p1.totalScore)
    p1.totalScore += lvlScore
    println("Level 3 score: "+p1.totalScore)

    println("Final score: "+p1.totalScore)
    println("Best level score: "+p1.personalBestScore)


}
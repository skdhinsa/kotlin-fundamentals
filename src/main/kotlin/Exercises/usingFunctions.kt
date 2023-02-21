package Exercises

fun getPoints(basePoints: Int, boost: Int): Int {
    return basePoints * boost
}

fun recursion(num: Int): Int {
    var res = 1
    for (i in 1..num){
        res *= i
    }
    return res
}

fun main() {

    var score = 0
    println(score)
    score += getPoints(10,1)
    println(score)
    score += getPoints(20,2)
    println(score)
    score += getPoints(-10,1)
    println(score)
    score += getPoints(5,3)
    println(score)
    score += getPoints(-15,2)

    println(recursion(4))
}
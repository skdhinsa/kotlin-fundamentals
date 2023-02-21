package Basics

fun main() {
    val exercised = false
    val inBudget = true
    val eatPizza = exercised && inBudget
    println(eatPizza)

    val text: String = if (exercised.and(inBudget)) "You can east pizza" else "Sorry, not today"



}
package Basics

fun main() {
    val name = "Serena"
    println("since name is val, it cannot be reassigned. Like final in Java. \nName=$name")

    var age = 29
    println("since age is a var, it can be reassigned. \nFirst age:$age")
    age = 30
    println("Second age:$age")
}